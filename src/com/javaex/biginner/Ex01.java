package com.javaex.biginner;

public class Ex01 {
	public static void main(String args[]) {
		
		int a = 100;
		
		for(int i=1; i<=a; i++)
		{
			if(i%5==0 && i%7==0)
			{
				System.out.println(i);
			}
		}
	}
}
