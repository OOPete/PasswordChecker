package Lab5;
import java.util.Scanner;
/*
 Peter Obinomen
 Computer Science 1
 10/4/2020
 
 In this lab we are creating a code that vertifies whether our input is valid
 for a password.
 */
public class NameSearch extends NameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard = new Scanner(System.in); //creating an input for the user
		String input; //variable that stores the input in a string
		char Choice; //character that is used to repeat the loop
		
		
		do //run this code while it meets the certain condition
		{
			
		System.out.println("enter a password that is 6 characters long,"
				+ " contains a lowercase letter, upper case letter, and number");
		
		input = keyboard.nextLine(); //gets the input from the user
		
		if(isValidPass(input)) //if the input is correct
		 {
			System.out.println("thats a valid password"); 
		 }
		else
		{
			System.out.println("thats not the proper password format");
		}
		
		System.out.println("do you want to do this again? 'Y/N"); //this is to repeat the code
		
		input = keyboard.nextLine();
		Choice = input.charAt(0);
		
		}while(Character.toUpperCase(Choice) == 'Y'); //enter Y or y to repeat the loop
		
	}

}
