package Listners;

import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners.TestNgListners.class) 
public class TestNgListnerDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test2");
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("This Test is skipped");
	}

}
