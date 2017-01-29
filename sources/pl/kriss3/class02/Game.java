package pl.kriss3.class02;

import java.sql.Date;
import java.time.LocalDate;

public class Game 
{
	public Date getRandomDate()
	{
		return Date.valueOf(LocalDate.now());
	}
	
	public void guessTheDate() 
	{
		
	}

}
