class PreFab extends PizzaBaseGUI
{
	private static double hawaiianOverload;
	private static double hamEgg;
	private static double beefPepperoni;
	private static double chogBurizo;
	private static double pizzaSupreme;

	public PreFab()
	{
		this.hawaiianOverload = 110.0;
		this.hamEgg = 95.0;
		this.beefPepperoni = 120.0;
		this.chogBurizo = 105.0;
		this.pizzaSupreme = 140.0;
	}

	public double addHawaiianOverload()
	{
		return this.hawaiianOverload;
	}

	public double addHamEgg()
	{
		return this.hamEgg;
	}

	public double addBeefPepperoni()
	{
		return this.beefPepperoni;
	}

	public double addChogBurizo()
	{
		return this.chogBurizo;
	}

	public double addPizzaSupreme()
	{
		return this.pizzaSupreme;
	}
}