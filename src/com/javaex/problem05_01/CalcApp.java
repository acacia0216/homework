package com.javaex.problem05_01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print(">>");
    	String num = sc.nextLine();
    	
    	String cal[] = num.split(" ");
    	int a = Integer.valueOf(cal[0]);
    	int b = Integer.valueOf(cal[2]);
    	
    	
    	while(true)
    	{
    	switch(cal[1])
    	{
    	case "+" :
    		Add add = new Add();
    		add.setValue(a, b);
    		System.out.println(add.calculate());
    		break;
    	case "-" : 
    		Sub sub = new Sub();
    		sub.setValue(a, b);
    		System.out.println(sub.calculate());
    		break;
    	case "*" :
    		Mul mul = new Mul();
    		mul.setValue(a, b);
    		System.out.println(mul.calculate());
    		break;
    	case "/" :
    		Div div = new Div();
    		div.setValue(a, b);
    		System.out.println(div.calculate());
    		break;
    	case "/q" : System.out.println("종료합니다.");
    	sc.close();
    	System.exit(0);
    	default : System.out.println("알수 없는 연산입니다.");
    	break;
    	}
    	}
    	
    	
    }
}
