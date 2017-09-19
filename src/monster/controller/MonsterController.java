package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
public void start()
	{
	MarshmallowMonster basic = new MarshmallowMonster();
	System.out.println(basic);
	MarshmallowMonster fred = new MarshmallowMonster("Silly Fred Monster", 7, 3, 6, true);
	System.out.println(fred);
	System.out.println("i am feeling hungry, i am going to eat one of fred arms");
	fred.setarmCount(fred.getarmCount() - 1);
	System.out.println(fred);
	
	interactWithMonster(fred);
	}
	
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants know how many eyes you want to eat, please type in how many");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
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
		myScanner.close();
		
		
}
}
