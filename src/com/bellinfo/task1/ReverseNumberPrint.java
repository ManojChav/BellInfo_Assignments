package com.bellinfo.task1;

import java.util.Scanner;

public class ReverseNumberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0,rnum=0;
System.out.println("enter your number");
Scanner rvn=new Scanner(System.in);
num=rvn.nextInt();
for(;num!=0;){
	rnum=rnum*10;
	rnum=rnum+num%10;
	num=num/10;
}
System.out.println("reverse of given number is"+rnum);
	}

}
