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
	int count= 0;
//	while(count< 10)
//	{
//		popup.displayText("Am i not the coolest??!");
//		count +=2;
//	}
	for(int loop = 0; loop < 10; loop+= 1)
	{
		popup.displayText("This is loop # " + (loop + 1 ) + " of ten");
	}
	
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
		int consumed = 0;
		
//		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		String response = popup.getResponse(currentMonster.getName() + "wants to know how many eyes you want to eat please lighten his load");
		
		while(!isValidInteger(response))
		{
			popup.displayText("grrr type in a better answ next time");
			response = popup.getResponse("Type in a integer value!");
		}
		
		
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
		System.out.println(currentMonster);
//		System.out.println("How my eyes are you interested in eating?, I Have" + currentMonster.getEyeCount());
		//consumed = myScanner.nextInt();
		response = popup.getResponse("How my eyes are you interested in eating?, I Have" + currentMonster.getEyeCount());
		while(!isValidInteger(response))
		{
			response = popup.getResponse("No type in a integer value aka 0....2billion");
		}
		
		int eyeEat = Integer.parseInt(response);		
		
		if(eyeEat == 0)
		{
//			System.out.println("Not hungry? I expected more of you. What a let Down!");
			popup.displayText("Not hungry? I expected more of you. What a let Down!");
		}
		else if(eyeEat < 0)
		{
//			System.out.println("Are you really trying to eat more than i have. Dang and i thought i was fat!");
			popup.displayText("Are you really trying to eat more than i have. Dang and i thought i was fat!");
		}
		else if (eyeEat > currentMonster.getEyeCount())
		{
//			System.out.println("Dude i cant give what I dont have unless your god and create more Eyes for me.");
			popup.displayText("Dude i cant give what I dont have unless your god and create more Eyes for me.");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - eyeEat);
//			System.out.println("Ok, now i have dis many eyes " + currentMonster.getarmCount());
			popup.displayText("Ok, now i have dis many eyes " + currentMonster.getEyeCount());
		}
//		System.out.println("How many arms are you interested in eating?, I Have" + currentMonster.getarmCount());
		popup.getResponse("How many arms are you interested in eating?, I Have" + currentMonster.getarmCount());
		//consumed = myScanner.nextInt();
		while(!isValidInteger(response))
		{
			response = popup.getResponse("No type in a integer value cmon dingus.");
		}
		
		int armEat = Integer.parseInt(response);
		
		if(armEat == 0)
		{
//			System.out.println("Not hungry? oh so sad....");
			popup.displayText("Not hungry? oh so sad....");
		}
		else if(armEat < 0)
		{
//			System.out.println("Reality is hard or you - it is impossible to eat a negative amount");
			popup.displayText("Reality is hard or you - it is impossible to eat a negative amount");
		}
		else if (armEat > currentMonster.getarmCount())
		{
//			System.out.println("You are not allowed to eat more than exists on me :/ :X");
			popup.displayText("You are not allowed to eat more than exists on me :/ :X");
		}
		else
		{
			 currentMonster.setarmCount(currentMonster.getarmCount() - armEat);
//			System.out.println("Ok, now I have this many arm " + currentMonster.getarmCount());
			popup.displayText("Ok, now I have this many arm " + currentMonster.getarmCount());
		}
		
//		System.out.println("How any tentacles do you want to eat? I have " + currentMonster.getTentacleAmount());
		double food = 0.0;
		String tentacleResponse = popup.getResponse("\"How any tentacles do you want to eat? I have \" + currentMonster.getTentacleAmount()");
		if(isValidDouble(tentacleResponse))
		{
			food = Double.parseDouble(tentacleResponse);
		}
		
		
		if(food == currentMonster.getTentacleAmount())
		{
//			System.out.println("You ate all my tentacles!!!");
			popup.displayText("You ate all my tentacles!!!");
		}
		else
		{
//			System.out.println("More likely");
			popup.displayText("More likely");
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
	
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
			
		}
		catch(NumberFormatException error)
		{
			popup.displayText("you need to type a double " + sampleDouble + "is not valid.");
		}
		
		return valid;
	}
}
