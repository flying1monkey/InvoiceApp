import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiations
		Product product;// = new Product();
		ArrayList <Product> productList = new ArrayList();
		Scanner scan = new Scanner(System.in);
				
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
		
		
		
		
		while(!isDone) //start loop
		{
			product = new Product();
			//get item price
			System.out.println("What's the item price?");
			product.setPrice(scan.nextDouble());
			//get item description
			System.out.println("What's the item description?");
			product.setDescr(scan.next());
			//add Product object to array
			productList.add(product);
			//prompt if user wants to add another item
			System.out.println("Do you want to add another item? 'y/n'");
			choice=scan.next();
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
				System.out.println("Incorrect choice.  Please type 'y' or 'n'");
				choice=scan.nextLine();
				isDone=true;
			}
		}
		
		//iterate through ArrayList and 1)add price to subtotal and 2)print the price
		for(int counter=0; counter<productList.size(); counter++) //maybe can be done with forEach and a lambda exp?
		{
			//product= new Product();
			subtotal+=productList.get(counter).getPrice();
			System.out.printf("The price of this item is $%.2f\n",productList.get(counter).getPrice());
		}

		taxAmt=(taxRate/100)*subtotal;//calculate tax amount
		total=subtotal+taxAmt;//calculate total
		
		System.out.printf("The total tax is: $%.2f\n",taxAmt); //print tax amount
		System.out.printf("Your total is: $%.2f\n",total); //print total
		
		
		
		
		
	}

}
