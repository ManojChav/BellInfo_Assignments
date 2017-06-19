package com.bellinfo.task1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Please enter a number");
				Scanner prn = new Scanner(System.in);
				int n = prn.nextInt();
			    int r=n/2;
			    int temp=0;
				for(int i=1;i<=r;i++){
				
					if(n%i==0){
					temp=temp+i;
					}}
					if(temp==n){
						System.out.println("it is a perfect number");
					}
					
					else{
						System.out.println("it is not a perfect number");
					}
											
							
						
			
				
			}

		}
	


