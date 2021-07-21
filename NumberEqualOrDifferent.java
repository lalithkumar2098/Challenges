/*
 * Challenge 3:
 Write a method printEqual with 3 parameters of type int. The method should not return anything ( void). 
 If one of the parameters is less than 0, print text "Invalid Value". 
 If all numbers are equal print text "All numbers are equal" 
 If all numbers are equal print text "All numbers are equal" 
 If all numbers are different print text "All numbers are different". 
 Otherwise, print "Neither all are equal or different".
 
  */


package com.technoelevate.challenge1;

public class NumberEqualOrDifferent 
{
	public static void main(String[] args) 
	{
		printEqual(40,30,20);//All numbers are different
		printEqual(30,30,30);//All numbers are equal
		printEqual(40,-2,-1);//Invalid Value
		printEqual(2,2,3);//Neither all are equal or different
		
	}
	
	public static void printEqual(int x, int y,int z)
	{
		if(x<0 || y<0 || z<0)
		{
			System.out.println("Invalid Value");
		}
		else if(x==y && y==z && x==z)
		{
			System.out.println("All numbers are equal");
		}
		else if(x!=y && y!=z && x!=z)
		{
			System.out.println("All numbers are different");
		}
		else
		{
			System.out.println("Neither all are equal or different");
		}
	}
}
