package com.team01.prajakta;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
	//Using algoRITHM
		
		int rev=0;
		while (num!=0) {
			
			rev=rev*10 +num%10;
			num=num/10;
			
		}
		System.out.println("reverce no :"+rev);
		
		
		
		
		
	}
	
	
	
}
