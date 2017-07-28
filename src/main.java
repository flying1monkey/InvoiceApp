import java.text.NumberFormat;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiations
		Product product;// = new Product();
		ArrayList <Product> productList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
				
		//variables
		boolean isDone=false;
		double subtotal=0;
		double total=0;
		int taxRateInt=0;
		double taxRate=0;
		double taxAmt=0.0;
		String choice="y";
		
		//get tax rate
		System.out.println("What is the tax rate? Please enter an integer.");
		taxRate=scan.nextDouble();
		scan.nextLine();
				
		
		
		while(!isDone) //start loop
		{
			product = new Product();
			//get item name
			System.out.println("What's the name of the product?");
			product.setName(scan.nextLine());
			//get item price
			System.out.println("What's the item price?");
			product.setPrice(scan.nextDouble());
			scan.nextLine();
			//get item description
			System.out.println("What's the item description?");
			product.setDescr(scan.nextLine());
			//add Product object to array
			productList.add(product);
			//prompt if user wants to add another item
			System.out.println("Do you want to add another item? 'y/n'");
			choice=scan.nextLine();
			//if not, exit loop
			if(choice.equalsIgnoreCase("n"))
			{
				isDone=true;
			}
			//if they didn't say y(es) or n(o), error message, reprompt
			/*TODO 
			 * Currently this only reprompts, then exits the loop
			 * Need to handle error and accept reprompt
			 */
			else if(!choice.equalsIgnoreCase("y"))
			{
				System.out.println("Choice:"+choice);
				System.out.println("Incorrect choice.  Please type 'y' or 'n'");
				choice=scan.nextLine();
				isDone=true;
			}
		}
		System.out.printf("\n\n\nThank you for ordering products with us.\n"
				+ "The list of items you purchased is below:\n\n");
		//iterate through ArrayList and 1)add price to subtotal and 2)print the item name and price
		for(int counter=0; counter<productList.size(); counter++) //maybe can be done with forEach and a lambda exp?
		{
			product= new Product();
			subtotal+=productList.get(counter).getPrice();
			System.out.printf("%s $%.2f\n",productList.get(counter).getName(), productList.get(counter).getPrice());
		}

		taxAmt=(taxRate/100)*subtotal;//calculate tax amount
		total=subtotal+taxAmt;//calculate total
		
			
		System.out.println("The total tax is: " +moneyFormat.format(taxAmt)); //print tax amount
		System.out.println("Your total is: "+moneyFormat.format(total)); //print total
		
	}
	
	

}
