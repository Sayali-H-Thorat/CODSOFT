/*  1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.*/

// Java Program to guess a Random Number Generation 

import java.util.Random; 
import java.util.Scanner; 

public class Program1 
{
	public static void main(String[] args)
	{
		int iAns=0, guess=0; 

		// maximum value is 100 
		final int MAX = 100; 

		// takes input using scanner 
		Scanner sobj = new Scanner(System.in); 

		// Random instance 
		Random rand = new Random(); 

		// boolean bRet = false; 

		// correct answer 
		iAns = rand.nextInt(MAX) + 1;
		

		// loop until the guess is correct
		int chance=5,iCnt=0;
		System.out.println("Guess a number between 1 and 100: ");

		for(iCnt=0;iCnt<chance;iCnt++)
		{
			//System.out.println("Guess a number between 1 and 100: ");
			guess = sobj.nextInt();

			if(guess>100)
			{
				System.out.println("You guess number bigger than 100");
				break;
			} 
			
			if(iAns==guess)
			{
				System.out.println("Congratulations!! You guessed the correct number..");
				break;
			}
			else if((iAns>guess) && (iCnt!=chance-1))
			{
				System.out.println("Too low, try again"); 
			}
			
			else if((iAns<guess) && (iCnt!=chance-1))
			{
				System.out.println("Too high, try again"); 
			}			
		}
		if(iCnt==chance)
		{
			System.out.println("Your trials are over..."+"Better luck next time!!!");
			System.out.println("Correct number is:"+iAns);

		}

		sobj.close();
	} 
}
