import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiations
		ArrayList <Product> list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		Product test = new Product();
		
		//variables
		double total;
		int taxRate;
		double taxAmt;
		
		
		System.out.println("What is the tax rate?");
		taxRate=scan.nextInt();
		
		//put this into a loop to gather more than one item
		System.out.println("What's the first item price?");
		test.setPrice(scan.nextDouble());
		System.out.println("What's the first item description?");
		test.setDescr(scan.next());
		//add Product object to array
		
		
		System.out.printf("Your price: %f and description: %s",test.getPrice(), test.getDescr());
		
		//when out of loop
		//enhanced For to loop through each product price and add it to total
		//also print price
		
		//calculate tax amount (taxRate/100)*total
		//print tax due
		//print total
		
	}

}
