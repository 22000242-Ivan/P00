import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testMultiple() {
		int a = 10;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(10, 2); 
			 
		int expected = 20;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testSubtract() {
		int a = 10;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 8;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDivideNormal() {
		int a = 10;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 5;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDivideError() {
		int a = 10;
		int b = 0;
		boolean exception = false;
		try {
			
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b);
			
			assertTrue(exception);
		} catch (ArithmeticException ae) {
			
			exception = true;
			assertTrue (exception);
		}
		
		
		
		}

}
