
		import java.util.Scanner;

		public class Mode { 

			public static void main(String[] args)	{
			
				//Declare variables
				
				double diameter;
				
				double labour_cost = 0.75;
				
				double rent_cost = 1.00;
			
				double materials = 0.05;
				
				double total_cost;
			
				System.out.print("Enter the diameter of the pizza in inches: ");    //Ask for user to input diameter
			
				Scanner user_input = new Scanner(System.in); 		

				diameter = user_input.nextDouble();         //store user's input
						
				total_cost = (materials*(diameter*diameter))+(rent_cost + labour_cost);  	// Calculate total cost
				
				System.out.println("The cost of making the pizza is: " + total_cost);  		// Print total cost 	
		
				
		}

	}