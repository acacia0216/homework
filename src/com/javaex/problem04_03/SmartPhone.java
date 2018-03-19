package com.javaex.problem04_03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        //코드작성
    	if(str.equals("앱"))
    		System.out.println("앱실행");
    	else
    		super.execute(str);
        
    }
 
    public void playMusic() {
    	System.out.println("다운로드해서 음악 재생");
    }
    //메소드작성
    
    //메소드작성
    
    
    
}
