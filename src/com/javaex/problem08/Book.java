package com.javaex.problem08;

public class Book {
    private String title, author;
    private int bookNo, stateCode;
    
    public Book(int bookNo, String title, String author)
    {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	stateCode = 1;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    public void setAuthor(String author) {
    	this.author = author;
    }
    public void setBookNo(int bookNo) {
    	this.bookNo = bookNo;
    }
    public void getTitle() {
    	
    }
    public void getAuthor() {
    	
    }
    public void getBookNo() {
    	
    }
    public void rent() {
    	if(this.stateCode == 1)
    	{
			this.stateCode = 0;
			System.out.println(this.title+" 이(가) 대여 됐습니다.");
		}
    	
    	else if(this.stateCode ==0)
    	{
    		this.stateCode = 1;
    		System.out.println(this.title+" 이(가) 반납 됐습니다.");
    	}
    }
    public void print() {
    	System.out.print(bookNo+" 책 제목 : "+title+", 작가 : "+author+", 대여 유무 : ");
    	if(stateCode == 0)
    		System.out.println("대여중");
    	else if(stateCode ==1)
    		System.out.println("재고있음");
    }
    
    
}
