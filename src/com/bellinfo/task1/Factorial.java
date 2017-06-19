package com.bellinfo.task1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner fcn=new Scanner(System.in);
System.out.print("enter the number");
int num=fcn.nextInt();
int fact=1;
for(int i=1;i<=num;i++){
	fact=fact*i;
}
System.out.println("the factorial is"+fact);
}

}


