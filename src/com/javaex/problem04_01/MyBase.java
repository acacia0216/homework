package com.javaex.problem04_01;

public class MyBase extends Base{

    //코드작성
	 public void service(String a) {
		 if(a.equals("오후"))
		 System.out.println("오후도 낮과 마찬가지로 일해야 합니다");
		 else if(a.equals("밤"))
		 super.night();
		 else
			 super.day();
	 }
    
}
