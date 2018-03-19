package com.javaex.biginner;

import java.util.Scanner;

public class Ex07 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("================================");
		System.out.println("  [숫자 맞추기 게임 시작]");
		System.out.println("================================");
		int ran = (int)(Math.random()*100)+1;
			while(true)
			{
				int input;
				System.out.print(">>");
				input = sc.nextInt();
				
				if(ran > input)
				{
					System.out.println("더 높게");
				}
				if(ran < input)
				{
					System.out.println("더 낮게");
				}
				if(ran == input)
				{	
					String yorn;
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까?(y/n) >>");
					
					sc.nextLine();
					yorn = sc.nextLine();
					
					if(yorn.equals("n"))
					{
						System.out.println("================================");
						System.out.println("  [숫자 맞추기 게임 시작]");
						System.out.println("================================");
						continue;
					}
					else
					{
						System.out.println("================================");
						System.out.println("  [숫자 맞추기 게임 종료]");
						System.out.println("================================");
						break;
					}
				}
			}
		
	}
}
