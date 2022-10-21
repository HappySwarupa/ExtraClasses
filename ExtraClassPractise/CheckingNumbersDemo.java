package com.example;
import java.util.*;
public class CheckingNumbersDemo {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1= sc.nextInt();
		if(num1>0)
		{
			System.out.println("The number is Positive");
			
		}
		else if(num1<0)
		{
			System.out.println("The number is Negetive");
		}
			
		else
		{
			System.out.println("The number is Zero");
		}
		
		
	}

}

