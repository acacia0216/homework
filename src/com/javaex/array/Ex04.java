package com.javaex.array;

import java.util.Scanner;

public class Ex04 {// 금액 입력받고 //금액별로 나누기
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int won[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 1 };
		int count[] = new int[8];
		int n = 0;

		System.out.print("금액 : ");
		n = sc.nextInt();
		System.out.println(n);
		for (int i = 0; i < won.length; i++)
		{
			while (n - won[i] > 0) 
			{
				count[i] += 1;
				n = n - won[i];
			}
		}
		
		for (int i = 0; i < won.length; i++) 
		{
			System.out.println(won[i] + "원 : " + count[i] + "개");
		}
	}
}
