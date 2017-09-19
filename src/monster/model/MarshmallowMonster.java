package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members
	
	private String name;
	private int EyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	
	public MarshmallowMonster()
	{
		//initializes everything to 0, false or null
	}
	
	public MarshmallowMonster(String name, int Eyecount, int arms, double tentacleCount, boolean hasbloop)
	{
		this.name = name;
		this.EyeCount = EyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
		
	}
	public String getName()
	{
		return name;
	}
	public int getEyeCount()
	{
		return EyeCount;
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
	public void setName(int EyeCount)
	{
		this.EyeCount = EyeCount;
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
		String description = "I am a monster, my name is " + name + " i have" + EyeCount + "eyes and only" ;
		description += tentacleAmount + " tentacles but I have " + armCount + " arms!." + hasBloop + " tells you";
		description += " if I have a bloop";
		return description;
		
	}

	public void setEyeCount(int i)
	{
		// TODO Auto-generated method stub
		
	}
}
