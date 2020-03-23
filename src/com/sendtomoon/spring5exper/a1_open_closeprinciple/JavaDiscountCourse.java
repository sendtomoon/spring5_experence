package com.sendtomoon.spring5exper.a1_open_closeprinciple;

/**
 * 在Java原有课程的基础上，要对Java进行优惠，不修改主类，继承Java课程，并重写方法
 *
 */
public class JavaDiscountCourse extends JavaCourse {

	public JavaDiscountCourse(Integer id, String name, Double price) {
		super(id, name, price);
	}
	
	public Double getOriginPrice() {
		return super.getPrice();
	}

	public Double getPrice() {
		return super.getPrice() * 0.65;
	}
}
