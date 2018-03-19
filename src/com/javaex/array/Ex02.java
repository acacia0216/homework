package com.javaex.array;

import java.util.Scanner;

public class Ex02 {//5개 입력받고 평균출력
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		double avg = 0;
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println(i+1+"번째 수를 입력하세요");
			num[i] = sc.nextInt();
			sc.close();
		}
		for(int i=0; i<num.length; i++)
		{
			avg += num[i];
		}
		System.out.println("평균 : "+avg/num.length);
	}
}
