//Faviola Bautista 
//this program is used to check if the statement is a palindrome or not using stacks.

import java.util.*;
public class Palindrome 
{
	
	public static void main(String[] args) 
	{
		//declaring variables
		Scanner reader = new Scanner(System.in);
		Stack <String> letters = new Stack <String>();
		String expression, add, check = "";
		
		
		//taking in word or statement from reader
		System.out.print("Enter a sentence or word: ");
		expression = reader.nextLine();
		
		
		//adding the letters into the stack
		for(int i = 0; i < expression.length(); i++)
		{
			if(i < expression.length() - 1)
				add = expression.substring(i, i +1);
			else
				add = expression.substring(i);
			
			letters.push(add);
		}
		
		
		//creating a variable to see if it is equal to the original
		while(!letters.empty())
		{
			String pop = letters.pop();
			check +=  pop;
		}
		
		
		//stating if words are equal or not
		if(check.equalsIgnoreCase(expression))
			System.out.print("The expression is a palindrome");
		
		else
			System.out.print("The expression is not a palindrome");

	}

}
