package com.javaex.problem03_05;

public class StringUtil {
    
    public static String concatString(String a[]){
       String b = "";
        for(int i=0; i<a.length; i++)
        {
        	b += a[i];
        }
        return b;
    }

}
