package com.javaex.biginner;

import java.util.Scanner;

public class Ex05 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int big = 0;
		for(int i=0; i<5; i++)
		{
			System.out.println("숫자를 입력하세요");
			n = sc.nextInt();
			
			if(n>big)
			{
				big = n;
			}
		}
		sc.close();
		System.out.println(big);
	}
}
