package pl.kriss3.class02;

import java.util.Random;
import java.util.Scanner;

public class Game 
{
	private static final int YEAR_LOWER_BOUND = 1600;
	private static final int YEAR_UPPER_BOUND = 2199;
	private static final int MONTH_LOWER_BOUND = 1;
	private static final int MONTH_UPPER_BOUND = 12;
	private static final int DAY_LOWER_BOUND = 1;
	private static final int DAY_UPPER_BOUND = 31;
	private Scanner sc = new Scanner(System.in);
	private Date myRandomDate = getRandomDate();
	
	
	public Date getRandomDate()
	{
		//get random year, month, day and pass to the Date class inclusive
		Random rnd = new Random();
		int rndYear = rnd.nextInt((YEAR_UPPER_BOUND - YEAR_LOWER_BOUND) +1) + YEAR_LOWER_BOUND;
		int rndMonth = rnd.nextInt((MONTH_UPPER_BOUND - MONTH_LOWER_BOUND) +1) + MONTH_LOWER_BOUND;
		int rndDay = rnd.nextInt((DAY_UPPER_BOUND - DAY_LOWER_BOUND) +1) + DAY_LOWER_BOUND;
		
		return new Date(rndDay, rndMonth, rndYear);
	}
	
	public void guessTheDate() 
	{
		boolean q = false;
		while(!q)
		{
			System.out.println("My date to guess: " + myRandomDate.toString());
			
			String t1 = getGuessedValue(myRandomDate.getYear(), "year");
			if(t1.equalsIgnoreCase("q"))
			{
				q = true;
				break;		
			}
				
			
			String t2 = getGuessedValue(myRandomDate.getMonth(), "month");
			if(t2.equalsIgnoreCase("q"))
			{
				q = true;
				break;		
			}
			
			String t3 = getGuessedValue(myRandomDate.getDay(), "day");
			if(t3.equalsIgnoreCase("q"))
			{
				q = true;
				break;		
			}
			
			if(t1!=null && t2 != null && t3 != null)
				System.out.println("Random Date is: " + t1 + " - " + t2 + " - " + t3 );
			
		}
		System.out.println("The game is over. Thank you!");
	}

	private String getGuessedValue(int baseValue, String denom)
	{
		String guessedValue = null;
		boolean keepPlaying = true;
		String answer = null;
		
		while(keepPlaying)
		{
			System.out.print("Guess " + denom + " (or [Q]uit): ");
			answer = sc.next();
			if(answer.equalsIgnoreCase("q"))
			{
				keepPlaying = false;
				guessedValue = answer;
				break;
			}
			else
			{
				if(!evaluate(answer, denom))
				{
					System.out.print("Wrong. " + answer + " is not a valid " + denom + ".");
					continue;
				}
				if(Integer.parseInt(answer) < baseValue)
				{
					System.out.print("Wrong. Higher. ");
					continue;
				} 
				else if(Integer.parseInt(answer) > baseValue)
				{
					System.out.print("Wrong. Lower. ");
					continue;
				} else
				{
					guessedValue = answer;
					System.out.print("Correct.");
					break;
				}
			}
		}
		return guessedValue;
	}
	
	private boolean evaluate(String value, String denom)
	{
		boolean result = true; 
		if(denom.equals("year") && (Integer.parseInt(value) > YEAR_UPPER_BOUND || Integer.parseInt(value) < YEAR_LOWER_BOUND))
			result = false;
		
		if(denom.equals("month") && (Integer.parseInt(value) > MONTH_UPPER_BOUND || Integer.parseInt(value) < MONTH_LOWER_BOUND))
			result = false;
			
		if(denom.equals("day") && (Integer.parseInt(value) > DAY_UPPER_BOUND || Integer.parseInt(value) < DAY_LOWER_BOUND))
			result = false;
		
		return result;
	}
}
