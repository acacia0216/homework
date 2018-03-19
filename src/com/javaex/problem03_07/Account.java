package com.javaex.problem03_07;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    public void deposit(int money) {
    	this.balance += money;
    }
    public void withdraw(int money) {
    	this.balance -= money;
    }
    public void showBalance() {
    	System.out.println(balance);
    }
    
    //필요한 메소드 작성

}
