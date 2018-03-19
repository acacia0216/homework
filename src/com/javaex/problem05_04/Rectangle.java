package com.javaex.problem05_04;

public class Rectangle extends Shape implements Resizeable{


	private double width;
	private double height;
	
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height)*2;
	}


	public void resize(double s) {
		this.width = width*s;
		this.height = height*s;
	}
	
}
