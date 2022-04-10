package Lab5;
import java.util.*;
public class NameClass {
	/*
	 This is the class for the password code
	 */
	
	public static boolean isValidPass(String PassWord) //creating the class
	{
		boolean GoodPass = true; //the password starts out at true till it fails the conditions
		
		int i = 0; //used to run through the characters
		
		if(PassWord.length() >= 6 == false)
		{
			GoodPass = false; // becames false if the length is not 6 characters long
		}
		
		
		while(GoodPass && i < PassWord.length()) //while GoodPass is true and i is less than 6
		{
			if(Character.isLetter(PassWord.charAt(i)))
			{
				GoodPass = true; //if there is a letter in the character then this loop breaks
				break;
	
			}
			else if(i == PassWord.length()-1 && !Character.isLetter(PassWord.charAt(i)))
			{
				GoodPass = false; //if there is no letter then the condition is false
			}
			i++; //goes through all the characters
		}
		
		i = 0; //i is set back to 0 or else it would start again at 6
		
		
	
		while(GoodPass && i < PassWord.length()) //same thing as the loop above but this time with uppercase
		{
			if(Character.isUpperCase(PassWord.charAt(i)))
			{
				GoodPass = true;
				break;
	
			}
			else if(i == PassWord.length()-1 && !Character.isUpperCase(PassWord.charAt(i)))
			{
				GoodPass = false;
			}
			i++;
		}
		
		i = 0;
		
		while(GoodPass && i < PassWord.length()) //same as the loop above but for lowercase
		{
			if(Character.isLowerCase(PassWord.charAt(i)))
			{
				GoodPass = true;
				break;
	
			}
			else if(i == PassWord.length()-1 && !Character.isLowerCase(PassWord.charAt(i)))
			{
				GoodPass = false;
			}
			i++;
		}
		
		i = 0;
		
		while(GoodPass && i < PassWord.length()) //same as the loop above but for digits
		{
			if(Character.isDigit(PassWord.charAt(i)))
			{
				GoodPass = true;
				break;
	
			}
			else if(i == PassWord.length()-1 && !Character.isDigit(PassWord.charAt(i)))
			{
				GoodPass = false;
			}
			i++;
		}
		
		return GoodPass; //returns the boolean value of GoodPass, if it is true then it is valid, else it is not valid
	
	
		
	}
}
