package Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryDemo {

	@Test
	public void test1() {
		System.out.println("I am in Test 1");
	}
	@Test
	public void test2() {
		System.out.println(8/0);
	}
	
	@Test(retryAnalyzer = Listners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("I am in Test 3");
		Assert.assertTrue("arpit".equals("neha"));
	}

}
