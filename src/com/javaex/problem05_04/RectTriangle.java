package com.javaex.problem05_04;

public class RectTriangle extends Shape{

	private double width;
	private double height;
	
	
	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height * 0.5;
	}
	
	public double getPerimeter() {
		return width + height + (Math.sqrt((width*width)+(height*height)));
	}
	
	
}
