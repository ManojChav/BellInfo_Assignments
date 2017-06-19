package com.bellinfo.task1;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Please enter a number");
		Scanner odn = new Scanner(System.in);
		int n = odn.nextInt();
	    int r=n/2,flag=1;
		for(int i=2;i<=r;i++){
		
			if(n%i==0){
				System.out.print("not a prime");
				break;
			}
				flag++;
				
					
				}
	
		if(flag>=r)
		System.out.print("it is a prime");
		odn.close();
	}

}
