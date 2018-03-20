package com.javaex.array;

public class Ex05 {//45까지 로또
	public static void main(String args[]) {
		
		int n = 6;
		int num[] = new int[n];
		 
		for(int i=0; i<n; i++)
			{
				num[i] = (int)(Math.random()*45)+1;
				for(int j=0; j<i; j++)
				{
					if(num[i] == num[j])
					{
						i--;
					}
				}
			}
		for(int i=0; i<n; i++)
		{
			System.out.print(num[i]+" ");
		}
			
	}
}
