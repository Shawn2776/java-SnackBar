package snackbarapp;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Snackbar Application");
		System.out.println();

		// public Customer(String name, double cashOnHand)
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		// public VendingMachine(String name)
		VendingMachine v1 = new VendingMachine("Food");
		VendingMachine v2 = new VendingMachine("Drink");
		VendingMachine v3 = new VendingMachine("Office");

		// public Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
		Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

		Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
		Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

		// Customer 1 (Jane) buys 3 of snack 4 (Soda).
		// public void buySnack(int numSnacksToBuy)
		// public double getTotalCost(int quantityOfSnacks)
		s4.buySnack(3);
		double fourSodaCost = s4.getTotalCost(3);
		// public void buySnacks(int totalCostOfSnacks)
		c1.buySnacks(fourSodaCost);

		//  Print Customer 1 (Jane) Cash on hand.
 		// Print quantity of snack 4 (Soda).
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
		System.out.println();

		// Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
		s3.buySnack(1);
		double onePretzelCost = s3.getTotalCost(1);
		c1.buySnacks(onePretzelCost);

		// Print Customer 1 (Jane) Cash on hand.
		// Print quantity of snack 3 (Pretzel).
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
		System.out.println();


		// Customer 2 (Bob) buys 2 of snack 4 (Soda).
		s4.buySnack(2);
		double twoSodaCost = s4.getTotalCost(2);
		c2.buySnacks(twoSodaCost);

		// Print Customer 2 (Bob) Cash on Hand.
		// Print quantity of snack 4 (Soda).
		System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
		System.out.println();


		// Customer 1 (Jane) finds $10.
		// public void addCashToCashOnHand(double cashToAdd)
		c1.addCashToCashOnHand(10);

		// Print Customer 1 (Jane) Cash on Hand.
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		System.out.println();


		//  Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
		s2.buySnack(1);
		double oneChocolateBarCost = s2.getTotalCost(1);
		c1.buySnacks(oneChocolateBarCost);

		// Print Customer 1 (Jane) Cash on Hand.
		// Print quantity of snack 2 (Chocolate Bar).
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());
		System.out.println();


		//  Add 12 more items to snack 3 (Pretzel).
		// public void addToQuantity(int quantityToAdd)
		s3.addToQuantity(12);

		// Print quantity of snack 3 (Pretzel).
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
		System.out.println();


		//  Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
		s3.buySnack(3);
		double threePretzelCost = s3.getTotalCost(3);
		c2.buySnacks(threePretzelCost);

		// Print Customer 2 (Bob) Cash on hand.
		// Print quantity of snack 3 (Pretzel).
		System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
		System.out.println();
	}
} 






























