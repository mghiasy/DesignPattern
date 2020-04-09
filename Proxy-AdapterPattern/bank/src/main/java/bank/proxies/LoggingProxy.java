package bank.proxies;

import bank.domain.MethodLogger;
//Reflection provides a means for invoking methods on a class.
import java.lang.reflect.*;

//********************************************************************
//create a new package for proxies and add all of them in this package
//name can just be Logger and Timer

//this class is not depend on DAO or any other class
public class LoggingProxy implements InvocationHandler {
    private Object target;
    MethodLogger logger= new MethodLogger();

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.log("Logger: Invoking: "+method.getName());
        //The java.lang.reflect.Method.invoke(Object obj, Object... args) method
        //invokes the underlying method represented by object that has  called this proxy
        return method.invoke(target,args);
    }
}


//Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.
//
//The required classes for reflection are provided under java.lang.reflect package.
//Reflection gives us information about the class to which an object belongs and also the methods of that class which can be executed by using the object.
//Through reflection we can invoke methods at runtime irrespective of the access specifier used with them.