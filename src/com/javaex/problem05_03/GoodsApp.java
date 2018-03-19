package com.javaex.problem05_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	List<Goods> al = new ArrayList<Goods>();
    	
    	
    	System.out.println("상품 3개를 입력해 주세요");
    	
    	Goods g1 = new Goods(sc.next(),Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
    	Goods g2 = new Goods(sc.next(),Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
    	Goods g3 = new Goods(sc.next(),Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
    	
    	al.add(g1);
    	al.add(g2);
    	al.add(g3);
    	
    	
    	
    	al.get(0).showInfo();
    	al.get(1).showInfo();
    	al.get(2).showInfo();
    	
    	System.out.println("모든 상품의 갯수는 "+
    			(al.get(0).getCount()+al.get(1).getCount()+al.get(2).getCount())
    			+ "개입니다.");
    	
    	sc.close();
    	
    	
    }

}
