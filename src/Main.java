import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int gallonsOfGas = 0; // Declaring a variable
        int milesPerGallon = 0; // Declaring a variable
        int TRAVELED_MILEAGE = 100; //Declaring a constant
        double priceOfGas = 0; //Declaring a double. Double because of the decimal values
        double totalPerMiles = 0; //Declaring a double
        double costPerMileage = 0; //Declaring a double
        double costForTravel = 0; //Declaring a double
        String trash = ""; //Declare a string

        Scanner in = new Scanner(System.in); //sets new scanner as in
        System.out.println("Enter how many gallons of Gas: "); //asks user for input
        if (in.hasNextInt()) //test's to see if input is good
        {
            if (in.hasNextInt()) //if input is good the code block below will run
            {
                gallonsOfGas = in.nextInt(); //sets the variable equal to the input
                System.out.println("You entered " + gallonsOfGas + " gallons of gas.");
            }
            else // code block will run if received input was incorrect
            {
                trash = in.nextLine(); //sets trash to string entry since we are expecting an integer
                System.out.println("Invalid entry " + trash);
            }
            System.out.println("Enter the miles per gallon of the vehicle :  "); //Output to ask user for input

            if (in.hasNextInt()) //tests to see if the input is correct if correct the code block will run
            {
                milesPerGallon = in.nextInt(); //sets the variable equal to the input
                System.out.println("You entered " + milesPerGallon + " miles per gallon."); //echo's what the user entered for confirmation
            }
            else // run's code block below if input is wrong
            {
                trash = in.nextLine(); //sets the input string to the string input that is received
                System.out.println("Invalid entry " + trash); // tells the user that an invalid value was entered and lists the value
            }
            System.out.println("Enter the price of gas per gallon : "); //asks user for input

            if (in.hasNextDouble()) //tests if the input is a double, if it is the code below will run
            {
                priceOfGas = in.nextDouble(); //sets price of gas variable to the input received by user
                System.out.println("You entered " + priceOfGas + " for the cost of a gallon of gas."); //echoes what the user entered for confirmation
                totalPerMiles = gallonsOfGas * milesPerGallon; //calculation for total miles able to travel on full tank of gas
                costPerMileage = priceOfGas / milesPerGallon; //calculation for the fuel cost per mile of travel based on what information is provided
                costForTravel = costPerMileage * TRAVELED_MILEAGE; //calculation for total cost if the user were to travel 100 miles
                System.out.println("With a full tank, you would be able to travel " + totalPerMiles + " miles."); //output showing how many miles the user would be able to travel
                System.out.println("The cost per mile is " + costPerMileage + " and if you were to travel 100 miles the cost would be $" + costForTravel); //output showing cost per mileage and the total cost for traveling 100 miles
            }
            else // run's code block if input is wrong
            {
                trash = in.nextLine(); // sets trash to String input since we are expecting a double or an integer
                System.out.println("Invalid entry " + trash);
            }

        }
        else //last resort to let us know that input received is not good and the program will exit
        {
            System.out.println("Invalid Entry " + trash);
        }
    }
}