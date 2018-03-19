package com.javaex.biginner;

public class Ex04 {
	public static void main(String args[]) {
		
		for(int i=1; i<=10; i++)
		{
			for(int j=i; j<i+10; j++)
			{
				System.out.print(j+"    ");
				if(j<10)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
