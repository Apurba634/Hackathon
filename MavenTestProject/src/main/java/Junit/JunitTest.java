package Junit;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	public void before() {
		System.out.println("Before Test Case");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		Basic Basic = new Basic();
		assertTrue("Num 1 is greater than Num 2", Basic.isGreater(4, 3));
	}
	
	@Test
	public void isGreaterTest2() {
		System.out.println("Test");
		Basic Basic = new Basic();
		assertTrue("Num 1 is greater than Num 2", Basic.isGreater(2, 3));
	}

	@After
	public void after() {
		System.out.println("After Test Case");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
