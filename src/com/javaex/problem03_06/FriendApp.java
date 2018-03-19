package com.javaex.problem03_06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        // 친구정보 입력받기
        String a[] = new String [3];
        for(int i=0; i<a.length; i++)
        {
        	a[i] = sc.nextLine();
        }
        //공백분리
        String q[] = new String[3];
        String w[] = new String[3];
        String e[] = new String[3];
        	q = a[0].split(" ");
        	w = a[1].split(" ");
        	e = a[2].split(" ");
        //객체생성해서 넣기
        	//배열추가
    	friendArray[0] = new Friend(q[0], q[1], q[2]);
    	friendArray[1] = new Friend(w[0], w[1], w[2]);
    	friendArray[2] = new Friend(e[0], e[1], e[2]);
//        	for(int i=0; i<friendArray.length; i++)
//        	{
//        		friendArray[i] = new Friend(sc.next(),sc.next(),sc.next());
//        	}
        	
    
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
