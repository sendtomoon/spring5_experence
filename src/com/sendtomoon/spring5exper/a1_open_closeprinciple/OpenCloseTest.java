package com.sendtomoon.spring5exper.a1_open_closeprinciple;

/**
 * 1.开闭原则，一个类、方法，对扩展开发，对修改关闭
 * 松耦合、可复用、灵活
 *
 */
public class OpenCloseTest {

	public static void main(String[] args) {
		
		Course course = new JavaCourse(1, "11", 900d);
		
		System.out.println(course.getPrice());
		
		course = new JavaDiscountCourse(2, "22", 900d);
		
		System.out.println(course.getPrice());
		
	}
}
