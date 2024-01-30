package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Date_TestClass {
	@Test
	public void test1() {
		LAB5_2_DateJUnit date= new LAB5_2_DateJUnit(11,01,2024);
		
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.toString());
		
		assertEquals(11,date.getDay());
		assertEquals(01,date.getMonth());
		assertEquals(2024,date.getYear());
		assertEquals("Date [Day=11, Month=1, Year=2024]" ,date.toString());
	}
}
