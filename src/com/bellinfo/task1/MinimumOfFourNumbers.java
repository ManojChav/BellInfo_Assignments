package com.bellinfo.task1;

import java.util.Scanner;

public class MinimumOfFourNumbers {
public static void main(String[] args){
int ary[] = new int[4];	
Scanner scn = new Scanner(System.in);
System.out.println("Please enter four numbers");
int min=0;
for(int i=0;i<ary.length;i++){
ary[i]=scn.nextInt();
//System.out.println(i);

}
min=ary[0];
for(int i=0;i<ary.length;i++){
	if(ary[i]<min){
		min=ary[i];
	
	}
	
	
}
System.out.println("The minimum number is"+min);

//System.out.println("");	
}
}

