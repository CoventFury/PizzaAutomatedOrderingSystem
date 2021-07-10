public class Drinks extends PizzaBaseGUI
{
	private static double lemonadeSmall;
	private static double lemonadeLarge;
	private static double cocaColaSmall;
	private static double cocaColaLarge;

	public Drinks()
	{
		this.lemonadeSmall = 20.0;
		this.lemonadeLarge = 75.0;
		this.cocaColaSmall = 15.0;
		this.cocaColaLarge = 50.0;
	}

	public double addLemonadeSmall()
	{
		return lemonadeSmall;
	}

	public double addLemonadeLarge()
	{
		return lemonadeLarge;
	}

	public double addCocaColaSmall()
	{
		return cocaColaSmall;
	}

	public double addCocaColaLarge()
	{
		return cocaColaLarge;
	}
}