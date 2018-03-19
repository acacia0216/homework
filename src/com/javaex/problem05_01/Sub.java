package com.javaex.problem05_01;

public class Sub extends CalcApp{

	   int a;
	   int b;
	   
	   
	   void setValue(int a, int b) {
		   this.a = a;
		   this.b = b;
	   }
	   
	   public int calculate() {
		   return a-b;
	   }


}
