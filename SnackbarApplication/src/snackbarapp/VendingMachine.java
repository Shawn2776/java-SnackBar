package snackbarapp;

public class VendingMachine
{
	// Fields / What they know
	private int maxId = 0;

	private int id;
	private String name;

	// behaviors / what it can do
	// constructor
	public VendingMachine(String name)
	{
		maxId++;
		id = maxId;

		this.name = name;
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

}