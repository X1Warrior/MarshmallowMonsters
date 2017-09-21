package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	
	
public void start()
	{
	MarshmallowMonster basic = new MarshmallowMonster();
//	System.out.println(basic);
	popup.displayText(basic.toString());
	MarshmallowMonster fred = new MarshmallowMonster("Silly Fred Monster" , 7 , 3 , 6.7 , true);
//	System.out.println(fred);
	popup.displayText(fred.toString());
//	System.out.println("i am feeling hungry, i am going to eat one of fred arms");
	popup.displayText("i am feeling hungry, i am going to eat one of fred arms");
	fred.setarmCount(fred.getarmCount() - 1);
	popup.displayText(toString());
	
	interactWithMonster(fred);
	}
	
	
	private void interactWithMonster(MarshmallowMonster currentMonster)

	{
		Scanner myScanner = new Scanner(System.in);
//		System.out.println(currentMonster.getName() + " wants know how many eyes you want to eat, please type in how many");
		int consumed;
		String response = popup.getResponse(currentMonster.getName() + " wants know how many eyes you want to eat, please type in how many");
		
		consumed = Integer.parseInt(response);
//		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
		System.out.println("How my eyes are you interested in eating?, I Have" + currentMonster.getEyeCount());
		//consumed = myScanner.nextInt();
		int eyeEat = myScanner.nextInt();
		
		if(eyeEat == 0)
		{
			System.out.println("Not hungry? I expected more of you. What a let Down!");
		}
		else if(eyeEat < 0)
		{
			System.out.println("Are you really trying to eat more than i have. Dang and i thought i was fat!");
		}
		else if (eyeEat > currentMonster.getEyeCount())
		{
			System.out.println("Dude i cant give what I dont have unless your god and create more Eyes for me.");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - eyeEat);
			System.out.println("Ok, now i have dis many eyes " + currentMonster.getarmCount());
		}
		System.out.println("How many arms are you interested in eating?, I Have" + currentMonster.getarmCount());
		//consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();
		
		if(armEat == 0)
		{
			System.out.println("Not hungry? oh so sad....");
		}
		else if(armEat < 0)
		{
			System.out.println("Reality is hard or you - it is impossible to eat a negative amount");
		}
		else if (armEat > currentMonster.getarmCount())
		{
			System.out.println("You are not allowed to eat more than exists on me :/ :X");
		}
		else
		{
			 currentMonster.setarmCount(currentMonster.getarmCount() - armEat);
			System.out.println("Ok, now I have this many arm " + currentMonster.getarmCount());
		}
		
		System.out.println("How any tentacles do you want to eat? I have " + currentMonster.getTentacleAmount());
		double food = myScanner.nextDouble();
		if(food == currentMonster.getTentacleAmount())
		{
			System.out.println("You ate all my tentacles!!!");
		}
		else
		{
			System.out.println("More likely");
		}
		
		popup.displayText("Hi there ready to play???");
		String answer = popup.getResponse("What is the average flight speed of a swallow");
		System.out.print(answer);
		myScanner.close();
		
		
}

	//Helper methods
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
			
		}
		catch(NumberFormatException error)
		{
		popup.displayText("you need to input an int, " + sample + "is not valid.");	
		}
		return valid;
	}
}
