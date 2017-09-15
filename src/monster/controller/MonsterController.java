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
		System.out.println(currentMonster.getName() + " wants know how many eyes you want to eat, pleasee type in how many");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		myScanner.close();
}
}
