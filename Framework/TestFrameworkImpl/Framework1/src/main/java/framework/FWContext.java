package framework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import application.Inject;
import application.Service;
import org.reflections.Reflections;

public class FWContext {

	private static List<Object> objectMap = new ArrayList<Object>();
	private static List<Object> serviceObjectMap = new ArrayList<Object>();
	public FWContext() {
		try {
			// find and instantiate all classes annotated with the @TestClass annotation
			Reflections reflections = new Reflections("");
			Set<Class<?>> types = reflections.getTypesAnnotatedWith(TestClass.class);
			for (Class<?> implementationClass : types) {
				//newinstance is deprecated
				//Replace newInstance() with getConstructor().newInstance()
				objectMap.add((Object) implementationClass.getConstructor().newInstance());
			}
			//find and instantiate all classes annotated with the @Service annotation
			Set<Class<?>> serviceType = reflections.getTypesAnnotatedWith(Service.class);
			for(Class<?> serviceClass:serviceType){
				serviceObjectMap.add(serviceClass.getConstructor().newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			for (Object theTestClass : objectMap) {
				List<Method> beforeMethods = new ArrayList<Method>();
				// find all methods annotated with the @Test annotation
				for (Method beforeMethod : theTestClass.getClass().getDeclaredMethods()) {
					if (beforeMethod.isAnnotationPresent(Before.class)) {
						beforeMethods.add(beforeMethod);
					}
				}
				// find all methods annotated with the @Test annotation
				for (Method method : theTestClass.getClass().getDeclaredMethods()) {
					if (method.isAnnotationPresent(Test.class)) {
						for(Method bm:beforeMethods){
							bm.invoke(theTestClass);
						}
						method.invoke(theTestClass);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		performDI();
	}

	private void performDI(){
		try{
			for(Object theTestClass :serviceObjectMap){
				for (Field field:theTestClass.getClass().getDeclaredFields()){
					if(field.isAnnotationPresent(Inject.class)){
						//get the type of the field ==> is the target class
						Class<?> theFieldType = field.getType();
						//get the obj of this type
						Object instance =getBeanOfType(theFieldType);
						//do the injection
						field.setAccessible(true);
						field.set(theTestClass,instance);
					}

				}
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	public Object getBeanOfType(Class interfaceClass){
		Object service = null;
		try {
			for(Object theTestClass :serviceObjectMap){
				//get list of interfaces
				Class<?>[] interfaces = theTestClass.getClass().getInterfaces();
				for(Class<?> theInterface:interfaces){
					if(theInterface.getName().contentEquals(interfaceClass.getName())){
						service=theTestClass;
					}
				}

			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return service;
	}
}
