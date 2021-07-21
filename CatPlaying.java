/*
Challenge 4:
 The cats spend most of the day playing. In particular, they play if the temperature
 is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 
 (inclusive) instead of 35.
 Write a method  isCatPlaying that has  2 parameters. Method needs to  return true  if the cat is playing, otherwise return false
  1st parameter should be of type  boolean and be named  summer it represents if it is summer.
  2nd parameter represents the  temperature and is of  type int with the  name temperature.
*/



package com.technoelevate.challenge1;

public class CatPlaying 
{
	public static void main(String[] args) 
	{
		//isCatPlaying(false, 25);
		System.out.println(isCatPlaying(true, 44));//true 
		System.out.println(isCatPlaying(true, 47));//false
		
		System.out.println(isCatPlaying(false, 34));//true
		System.out.println(isCatPlaying(false, 37));//false
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature)
	{
		if(summer==true)
		{
			if(temperature>=25 && temperature<=45)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else if(temperature>=25 && temperature<=35)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
