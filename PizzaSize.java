public class PizzaSize extends PizzaBaseGUI
{
	private double sixInchPrice;
	private double nineInchPrice;
	private double twelveInchPrice;

	public PizzaSize()
	{
		this.sixInchPrice = 1.0;
		this.nineInchPrice = 1.5;
		this.twelveInchPrice = 1.75;
	}

	public double getSixInchPrice()
	{
		return this.sixInchPrice;
	}

	public double getNineInchPrice()
	{
		return this.nineInchPrice;
	}

	public double getTwelveInchPrice()
	{
		return this.twelveInchPrice;
	}
}