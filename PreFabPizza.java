public class PreFabPizza
{
	private PreFab preFabChoice;
	private PizzaSize pizzaSize;
	private CrustType crustType;
	public double preFabPrice;

	public PreFabPizza(PreFab preFabChoice, PizzaSize pizzaSize, CrustType crustType)
	{
		this.preFabChoice = preFabChoice;
		this.pizzaSize = pizzaSize;
		this.crustType = crustType;
	}

	public void setPreFabChoice(PreFab preFabChoice)
	{
		this.preFabChoice = preFabChoice;
	}

	public void setPizzaSize(PizzaSize pizzaSize)
	{
		this.pizzaSize = pizzaSize;
	}

	public void setCrustType(CrustType crustType)
	{
		this.crustType = crustType;
	}

	public void setPreFabPrice (double preFabPrice)
	{
		this.preFabPrice = preFabPrice;
	}

	public PreFab getPreFabChoice()
	{
		return preFabChoice;
	}

	public PizzaSize getPizzaSize()
	{
		return pizzaSize;
	}

	public CrustType getCrustType()
	{
		return crustType;
	}
	/*
	public double getPreFabPrice()
	{
		preFabPrice = this.preFabChoice + this.pizzaSize + this.crustType;
		return preFabPrice;
	}
	*/
}