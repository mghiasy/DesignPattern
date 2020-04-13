package application;

import framework.Test;
import framework.TestClass;
import framework.Before;
//With the help of static import, we can access the static members of a class directly without class name or any object
//e.g: we use sqrt() by using  i.e. Math.sqrt(), but by using static import we can access sqrt() method directly.
//it will lead to confusion and not good for programming

// Java Program to illustrate
// calling of predefined methods
// with static import
import static java.lang.Math.*;


import static framework.Asserts.*;

@TestClass
public class MyTest {
	//part c
	@Inject
	Calculator calculator;
	//Asserts asserts= new Asserts();

	@Before
	public void init() {
		System.out.println("perform initialization");
		calculator = new CalculatorImpl();
	}

	@Test
	public void testMethod1() {
		System.out.println("perform test method 1");
		//asserts.assertEquals(calculator.add(3),3);
		assertEquals(calculator.add(3),3);
		//asserts.assertEquals(calculator.add(6),9);
		assertEquals(calculator.add(6),9);
	}
	@Test
	public void testMethod2() {
		System.out.println("perform test method 2");
		//asserts.assertEquals(calculator.add(3),3);
		assertEquals(calculator.add(3),3);
		//asserts.assertEquals(calculator.subtract(6),-1);
		assertEquals(calculator.subtract(6),-1);
	}
}
