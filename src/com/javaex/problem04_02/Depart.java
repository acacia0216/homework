package com.javaex.problem04_02;

public class Depart extends Employee {

	private String depart;
    //코드작성
	public Depart(String name, int salary, String depart) {
	super.setName(name);
	super.setSalary(salary);
	this.depart = depart;
	}
	
	public void getInformation() {
		System.out.println("이름:"+super.getName()+"  연봉:"+super.getSalary()+"  부서:"+this.depart);
	}
	
}
