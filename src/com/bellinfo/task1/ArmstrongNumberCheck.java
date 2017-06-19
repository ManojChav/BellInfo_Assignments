package com.bellinfo.task1;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner anc = new Scanner(System.in);
		int n = anc.nextInt();
		
		String s=n+"";
		int a=s.length();
		
	    int sum=0;
	   
	    int y=0;
	    int temp=n;
	    while(temp!=0){
	    
	     y=temp%10;
	     sum=sum+(int)Math.pow(y,a);
	     temp=temp/10;
	   
	    }	
	    
	    
	    if(n==sum){
	    System.out.println("It is an Armstrong number");}
	    else {
	    
	    	System.out.println("not an Armstrong number");
	}

}}