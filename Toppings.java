public class Toppings extends PizzaBaseGUI
{
	private static double topping;
	private static double ham;
	private static double pepperoni;
	private static double bellPepper;
	private static double groundMeat;
	private static double pineapple;
	private static double chorizo;

	public Toppings()
	{
		this.ham = 30.25;
		this.pepperoni = 47.50;
		this.bellPepper = 18.00;
		this.groundMeat = 35.75;
		this.pineapple = 24.25;
		this.chorizo = 27.80;
	}

	public void setTopping()
	{
		this.topping = topping;
	}
	
	public double addHam()
	{
		return this.ham;
	}

	public double addPepperoni()
	{
		return this.pepperoni;
	}

	public double addBellPepper()
	{
		return this.bellPepper;
	}

	public double addGroundMeat()
	{
		return this.groundMeat;
	}

	public double addPineapple()
	{
		return this.pineapple;
	}

	public double addChorizo()
	{
		return this.chorizo;
	}
}