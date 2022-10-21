package com.example;
import java.util.*;
public class EvenorOddDemo {
	public static int EvenorOdd(int num) {
		if(num%2==0) {
			System.out.println("True");
			
		}
		else
		{
			System.out.println("False");
		}
		
		return num;
		
	}
	public static void main(String args[])
	{
	   int isEven=EvenorOdd(9);
	   System.out.println(isEven);
		
	}
	

}
