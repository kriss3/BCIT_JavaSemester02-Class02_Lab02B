package pl.kriss3.class02;

/**
 * Runner class to manage Date guessing game;
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class02_Lab02B.git
 * @since 2017-01-27
 */
public class Runner 
{	
	public static void main(String[] args)
	{
		run();
	}
	
	public static void run()
	{
		Game game = new Game();
		game.guessTheDate();
		
		game.guessTheBirthdayDay();
	}
}
