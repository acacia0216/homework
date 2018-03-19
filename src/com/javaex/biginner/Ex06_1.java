package com.javaex.biginner;

import java.util.Scanner;

public class Ex06_1 {//n까지 짝or홀수의 합
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int start;
		int sum = 0;
		
		System.out.print("수 입력");
		n = sc.nextInt();
		
		if(n%2 == 0)
		{
			start = 2;
		}
		else
		{
			start = 1;
		}
		for(int i=start; i<=n; i+=2)
		{
			sum += i;
		}
		System.out.println(sum);
	}
}
