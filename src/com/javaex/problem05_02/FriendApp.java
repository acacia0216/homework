package com.javaex.problem05_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     List<Friend> al = new ArrayList<Friend>();
     
     Friend f1 = new Friend();
     Friend f2 = new Friend();
     Friend f3 = new Friend();
     
     
     al.add(f1);
     al.add(f2);
     al.add(f3);
     
     f1.setName(sc.next());
     f1.setHp(sc.next());
     f1.setSchool(sc.next());
     
     f2.setName(sc.next());
     f2.setHp(sc.next());
     f2.setSchool(sc.next());
     
     f3.setName(sc.next());
     f3.setHp(sc.next());
     f3.setSchool(sc.next());
     
     
     for(int i=0; i<al.size(); i++)
     {
    	 al.get(i).showInfo();
     }
     
     
     sc.close();
     
    }

}
