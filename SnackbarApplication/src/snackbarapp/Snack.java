package snackbarapp;

public class Snack
{
	// fields / what they know
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// behaviors / what can it do
	// constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		this.id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	//getters and setters
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	public int getQuantity()
	{
		return quantity;
	}

	// other methods
	public void addToQuantity(int quantityToAdd)
	{
		this.quantity = quantity + quantityToAdd;
	}

	public void buySnack(int numSnacksToBuy)
	{
		this.quantity = quantity - numSnacksToBuy;
	}

	public double getTotalCost(double quantityOfSnacks)
	{
		double totalCostOfSnacks = quantityOfSnacks * cost;
		return totalCostOfSnacks;
	}

}
















