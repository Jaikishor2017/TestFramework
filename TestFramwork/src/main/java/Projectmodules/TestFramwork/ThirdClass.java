package Projectmodules.TestFramwork;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThirdClass {
	
	@Test
	public void Thirdclassmentodone()
	{System.out.println("Thirdclassmentodone");}
	@Test
	public void ThirdClassMentodTwo()
	{System.out.println("ThirdClassMentodTwo");}
	@Test
	public void  ThirdClassMentodThree()
	{System.out.println("ThirdClassMentodThree");}
	@BeforeTest
	public void  BeforeTest()
	{System.out.println("BeforeTest");}
	@BeforeMethod
	public void beforemetod()
	{
		System.out.println("beforemetod");
	}
}
