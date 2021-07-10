public class Order
{
	private double totalPreFabPrice;
	private double totalDiyPrice;
	private double totalDrinkPrice;
	private double subTotal;

	public Order()
	{
		this.totalPreFabPrice = totalPreFabPrice;
		this.totalDiyPrice = totalDiyPrice;
		this.totalDrinkPrice = totalDrinkPrice;
		this.subTotal = getSubtotal();
	}

	public double getSubTotal()
	{
		subTotal = this.totalPreFabPrice + this.totalDiyPrice + this.totalDrinkPrice;
	}

	public double getTotalPreFabPrice()
	{
		return totalPreFabPrice;
	}

	public double getTotalDiyPrice()
	{
		return totalDiyPrice;
	}

	public double getTotalDrinkPrice()
	{
		return totalDrinkPrice;
	}
}