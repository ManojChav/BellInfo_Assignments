package com.bellinfo.task1;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rnum=0;
		System.out.println("enter your number");
		Scanner pln=new Scanner(System.in);
		num=pln.nextInt();
		int temp=num;
		for(;num!=0;){
			rnum=rnum*10;
			rnum=rnum+num%10;
			num=num/10;
		}
		//System.out.println("this is the original number"+num+"this is reverse"+rnum);
		if(temp==rnum){
		    System.out.println("It is a palindrome");}
		    else {
		    
		    	System.out.println("not a Palindrome");
		}}
			}


	

