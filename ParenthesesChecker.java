//Faviola Bautista 
//This program takes in an expression with parentheses and displays a list of the positions of pairs of parenthesis using stacks

import java.util.*;
public class ParenthesesChecker 
{
	public static void main(String[] args) 
	{
		//declaring variables
		Scanner reader = new Scanner(System.in);
		int countO = 0, countC = 0;
		String expression;
		Stack <Integer> parenClosed = new Stack <Integer>();
		ArrayList <Integer> parenOpen = new ArrayList <Integer>();
		Stack <Integer> stack = new Stack <Integer>();
				
		
		//taking in expression from user
		System.out.print("Enter an expression: ");
		expression = reader.nextLine();
		
		
		//counting to see how many opening and closing parenthesis there are
		for(int i = 0; i < expression.length(); i ++)
		{
			if(expression.charAt(i) == '(')
			{
				countO ++;
			}
			
			if(expression.charAt(i) == ')')
			{
				countC ++;
			}
		}
		
		//if even amount of parenthesis, creating a stack with the indexes 
		if(countC  == countO)
		{
			for(int i = 1; i <= expression.length(); i++)
			{
				stack.push(i);
			}
			
			//if character in the stack is a parenthesis, adding it to a new stack or array
			for(int i = expression.length() - 1; i  >= 0 && !stack.empty() ; i--)
			{
				if(expression.charAt(i) == ')')
				{
					parenClosed.push(stack.pop());
				}
				
				if(expression.charAt(i) == '(')
				{
					parenOpen.add(stack.pop());
				}
				
				else if(expression.charAt(i) != '(' && expression.charAt(i) != ')')
				{
					stack.pop();
				}	
					
			}
			
			
			//printing out the pairs of parenthesis
			for(int i = 0; i < parenOpen.size() && !parenClosed.empty(); i++)
			{
				System.out.println("Pair: " + parenClosed.pop() +
						" " + parenOpen.get(i));
			}
		}
		
		//if there is an uneven amount of parenthesis, state so
		else
		{
			System.out.print("There is not an even number of parentheses");
		}
		
		
	}

}
