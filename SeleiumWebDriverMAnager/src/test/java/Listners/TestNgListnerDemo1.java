package Listners;

import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners.TestNgListners.class) 
public class TestNgListnerDemo1 {

	@Test
	public void test4() {
		System.out.println("I am inside test4");
	}
	@Test
	public void test5() {
		System.out.println("I am inside test5");
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void test6() {
		System.out.println("I am inside test6");
		throw new SkipException("This Test is skipped");
	}

}
