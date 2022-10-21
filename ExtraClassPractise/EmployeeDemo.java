package com.example;
import java.util.*;
public class EmployeeDemo {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee Details");
		int Age= sc.nextInt();
		String Name= sc.next();
		if(Age<25)
		{
			System.out.println("Exicutive");
			
		}
		else
		{
			System.out.println("Retail Exicutive");
		}
		
		
	}

}
