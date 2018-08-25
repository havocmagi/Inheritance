import java.util.Scanner;

public class LabShips 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter ship name: ");
		String name = input.next();
		System.out.printf("Please enter the crew complement: ");
		int crew = input.nextInt();
		System.out.printf("Is the ship a Freighter or a Liner?\n");
		System.out.printf("Enter 'F' for Freighter, or 'L' for Liner: ");
		String type = input.next();
		if (type.equalsIgnoreCase("f")) // for a ship of type: Freighter.
		{
			System.out.printf("Please enter your freight capacity in tons: ");
			double capacity = input.nextDouble();
			Freighter fship = new Freighter(name,crew,capacity); // Student: Construct a Freighter object here
			System.out.println("Freighter: \n"+fship.toString());// Display before changes.
			System.out.printf("Please change the crew number: ");
			crew = input.nextInt();
			System.out.printf("Please change the ship capacity: ");
			capacity = input.nextDouble();
			Freighter cfship = new Freighter(name,crew,capacity);
			System.out.println("Freighter: \n"+cfship.toString());/* display all the instance variables after the changes here */
		}
		else 
		{ // Repeat the above for a ship of type Liner in the else block.
			System.out.printf("Please enter # of Passengers: ");
			int passengers = input.nextInt();
			Liner lship = new Liner(name,crew,passengers); // Student: Construct a Freighter object here
			System.out.println("\nLiner: \n"+lship.toString());// Display before changes.
			System.out.printf("Please change the crew number: ");
			crew = input.nextInt();
			System.out.printf("Please change the # of Passengers: ");
			passengers = input.nextInt();
			Liner clship = new Liner(name,crew,passengers);
			System.out.println("\nLiner: \n"+clship.toString());/* display all the instance variables after the changes here */
		}
	} // end main
} // end class