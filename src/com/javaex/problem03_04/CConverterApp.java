package com.javaex.problem03_04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        
        //백만원을 달러로 출력
        System.out.println(CConverter.toDoller(1000000));

        
        //100달려를 원으로 출력
        System.out.println(CConverter.toKWR(100));
        
        
    }

}
