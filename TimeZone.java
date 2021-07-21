package com.technoelevate.challenge1;

public class TimeZone 
{
	public static void main(String[] args) 
	{
		System.out.println(getDurationString(126,69));
		System.out.println(getDurationString(126,50));
		System.out.println(getDurationString(3600));
		System.out.println(getDurationString(452,15));
		
	}
	
	public static String getDurationString(int minutes , int seconds)
	{
		String str="";
			if(minutes>=0 && seconds>=0 && seconds<=59)
			{
				int totalTime=minutes*60 +seconds;
				str = ((totalTime/3600)+"h "+(totalTime%3600)/60 +"m "+ totalTime % 60+"s ");                         
				//return "";
			} 
			else
			{
				return "Invalid value";
			}
			return str;
	}
	
	public static String getDurationString(int seconds)
	{
		String str="";
		if(seconds>=0)
		{
			int minutes;
			minutes=seconds/60;
			seconds=seconds%60;
			str = getDurationString(minutes,seconds);
			
		}
		else
		{
			return "Invalid value" ; 
		}
		return str;
	}

}





