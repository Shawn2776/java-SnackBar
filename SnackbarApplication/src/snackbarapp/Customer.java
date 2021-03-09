package snackbarapp;

public class Customer
{
	private int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	// getters and setters
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


	public double getCashOnHand()
	{
		return cashOnHand;
	}

	public void addCashToCashOnHand(double cashToAdd)
	{
		this.cashOnHand = cashOnHand + cashToAdd;
	}

	public void buySnacks(double totalCostOfSnacks)
	{
		this.cashOnHand = cashOnHand - totalCostOfSnacks;
	}


}