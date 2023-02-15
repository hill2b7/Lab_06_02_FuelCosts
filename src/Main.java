import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int milesPerGallon = 0; //declares variable
        int gallonsOfGas = 0; //declares variable
        int totalPerMiles = 0; //declare variable
        int TRAVELED_MILEAGE = 100; //declare a constant
        double priceOfGas = 0; //declares variable
        double costPerMileage = 0; //declares double
        double costForTravel = 0; //declare double
        String trash = ""; //declares string

        Scanner in = new Scanner(System.in); //imports scanner in java

        System.out.println("Enter how many gallons of gas your tank can hold: "); //output asking the user for input
        if (in.hasNextInt()) // if the input is an integer value then the code block below runs
        {
            gallonsOfGas = in.nextInt();//sets gallonsOfGas variable to the input received by the end user
            System.out.println("Enter the mileage per gallon for your vehicle: "); //output asking the user for input
            if (in.hasNextInt()) //if the input received is an integer the code block below will run
            {
                milesPerGallon = in.nextInt(); //sets milesPerGallon equal to the input received by the user
                System.out.println("Enter the price of gas per gallon: "); //output asking the user for input
                if (in.hasNextDouble()) //checks to see if the input is a double. If the input is a double the code block below will run
                {
                    priceOfGas = in.nextDouble();
                    totalPerMiles = gallonsOfGas * milesPerGallon; //calculation to get the total mileage that you can travel with a full tank
                    costPerMileage = priceOfGas / milesPerGallon; //calculation to get the cost per mile
                    costForTravel = costPerMileage * TRAVELED_MILEAGE; //calculation to get the cost if you were to travel 100 miles
                    System.out.println("With a full tank, you would be able to travel " +totalPerMiles + " miles."); //output that shows how far the user could travel with a full tank
                    System.out.println("The cost per mile is " + costPerMileage + " and if you were to travel 100 miles the cost would be $" +costForTravel); //output that shows how much each mile would cost and how much it would cost to travel 100 miles based on the input of the user

                }
                else// if input is not a double then the code block below will run
                {
                    trash = in.nextLine(); //sets trash string to string input that is received by the end user
                    System.out.println("You entered an incorrect value " + trash);//out that lets the user know that the input received is incorrect
                }

            }
            else // if input is not an integer then the code block below will run
            {
                trash = in.nextLine(); //sets trash string to string input that iss received by the end user
                System.out.println("You entered an incorrect value " + trash); //out that lets the user know that the input received is incorrect
            }
        }
        else // if input is not an integer then the code block below will run
        {
            trash = in.nextLine(); // sets
            System.out.println("You entered an incorrect value " + trash);
        }


    }
}