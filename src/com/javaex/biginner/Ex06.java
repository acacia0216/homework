package com.javaex.biginner;

import java.util.Scanner;

public class Ex06 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		
		System.out.println("숫자를 입력하세요");
		n = sc.nextInt();
		
		if(n%2 == 0)//짝수
		{
			for(int i=1; i<=n; i++)//1부터 n까지
			{
				if(i%2 == 0)//짝수이면
				{
					sum += i;//합
				}
			}
			System.out.println(sum);
		}
		else if(n%2 != 0)//홀수
		{
			for(int i=1; i<=n; i++)
			{
				if(i%2 != 0)
				{
					sum += i;
				}
			}	
			System.out.println(sum);
		}
		else
		{
			System.out.println("응...?");
		}
		sc.close();
	}
}
