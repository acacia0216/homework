package com.javaex.biginner;

import java.util.Scanner;

public class Ex08 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int money = 0;
		
		out :while(true)
		{
			int input;
			System.out.println("=================================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=================================");
			System.out.println("선택 > ");
			input = sc.nextInt();
			switch(input)
			{
			case 1 : 
				System.out.println("예금액 > ");
				input = sc.nextInt();
				money += input;
				break;
			case 2 :
				System.out.println("출금액 > ");
				input = sc.nextInt();
				money -= input;
				break;
			case 3 : 
				System.out.print("잔고 > "+money);
				System.out.println();
				break;
			case 4 :
				System.out.println("프로그램 종료");
				sc.close();
				break out;
			default : 
				System.out.println("다시 입력해주세요");
				continue;
				
			}
		}
	}
}
