package com.javaex.array;

public class Ex03 {
	public static void main(String args[]) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		String a = "";
		String b = "";
		 
		for(int i=0; i<c.length; i++)
		{
			a += String.valueOf(c[i]);
		}
		System.out.println(a);
		for(int i=0; i<c.length; i++)
		{
			if(c[i]==' ')
			{
				c[i] = ',';
			}
			b += String.valueOf(c[i]);
		}
		System.out.println(b);
	}
}
