package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members
	
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	
	public MarshmallowMonster()
	{
		//initializes everything to 0, false 
	}
	
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
		
	}
	public String getName()
	{
		return name;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public int getarmCount()
	{
		return armCount;	
	}
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	public boolean hasBloop()
	{
		return hasBloop;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	public void setarmCount(int armCount)
	{
		this.armCount = armCount;
	}
	public void setName(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	public String toString()
	{
		String description = "I am a monster, my name is " + name + " i have" + eyeCount + "eyes and only" ;
		description += tentacleAmount + " tentacles but I have " + armCount + " arms!." + hasBloop + " tells you";
		description += " if I have a bloop";
		return description;
		
	}
}
