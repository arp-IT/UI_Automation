package Grouping;

import org.testng.annotations.Test;

public class TestNgGroupsDemo {
	
	@Test(groups = {"Sanity"})
 	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test(groups = {"Regression"})
	public void test2() {
		System.out.println("This is test2");
	}
	
	@Test(groups = {"Regression","Sanity"})
	public void test3() {
		System.out.println("This is test3");
	}
	
	@Test
	public void test4() {
		System.out.println("This is test4");
	}

}
