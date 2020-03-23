package com.sendtomoon.spring5exper.a1_open_closeprinciple;

/**
 * 其次，有一个Java课程的实现类，实例化他时，会返回该课程的所有特征
 *
 */
public class JavaCourse implements Course {

	private Integer id;
	private String name;
	private Double price;

	public JavaCourse(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
