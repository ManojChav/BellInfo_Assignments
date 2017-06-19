package com.bellinfo.task1;

import java.util.Scanner;

public class FibbonacciSequenceGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner fbs = new Scanner(System.in);
System.out.println("give the number");
int num =fbs.nextInt();
if(num==0){
System.out.println("0")	;
}else if (num==1){
	System.out.println("0 , 1")	;

}else{
	System.out.println("0,1");
	int a=0,b=1;

	for(int i=2;i<num;i++){
		int fibonac=a+b;
		System.out.println(fibonac);
		a=b;
		b=fibonac;
	}
	
	
}
	}

}
