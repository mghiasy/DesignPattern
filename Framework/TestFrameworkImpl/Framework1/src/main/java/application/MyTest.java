package application;

import framework.Test;
import framework.TestClass;
import framework.Before;
import framework.Asserts;

@TestClass
public class MyTest {
	@Inject
	Calculator calculator;
	Asserts asserts= new Asserts();

	@Before
	public void init() {
		System.out.println("perform initialization");
		calculator = new CalculatorImpl();
	}

	@Test
	public void testMethod1() {
		System.out.println("perform test method 1");
		asserts.assertEquals(calculator.add(3),3);
		asserts.assertEquals(calculator.add(6),9);
	}
	@Test
	public void testMethod2() {
		System.out.println("perform test method 2");
		asserts.assertEquals(calculator.add(3),3);
		asserts.assertEquals(calculator.subtract(6),-1);
	}
}
