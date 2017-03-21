import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		//while loop while the choice is y
	while(choice.equalsIgnoreCase("y")){
		//Prompt user to enter number
		System.out.println("Enter number of cents (0-99): ");
		int number = Integer.parseInt(sc.nextLine());
		//create variables
		int numQ = 0;
		int numD = 0;
		int numN = 0;
		int numQr = 0;
		int numDr = 0;
		int numNr = 0;
		//calculate modulus and number of quarters, dimes, nickels, and pennies
		numQ = number / 25;
		numQr = number % 25;
		numD = numQr / 10;
		numDr = numQr % 10;
		numN = numDr / 5;
		numNr = numDr % 5;
		//Print out the results
		String message = "Quarters: " + numQ + "\n" + "Dimes: " + numD + "\n"
				+ "Nickels: " + numN + "\n" + "Pennies: " + numNr;
		System.out.println(message);
		//Ask user to continue
		System.out.println("Continue? (y/n): ");
		choice = sc.nextLine();
		System.out.println();
		}//end of while loop
	sc.close();
	System.out.println("Bye!");
	}//end of main class
}//end of class

