import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int gallonsOfGas = 0;
        int milesPerGallon = 0;
        int TRAVELED_MILEAGE = 100;
        double priceOfGas = 0;
        double totalPerMiles = 0;
        double costPerMileage = 0;
        double costForTravel = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the gallons of gas in the tank: ");

        if (in.hasNextInt())
        {
            gallonsOfGas = in.nextInt();
            System.out.println("You entered " + gallonsOfGas + " gallons of gas");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid entry " + trash);
        }

        System.out.println("Enter the miles per gallon: ");
        if (in.hasNextInt())
        {
            milesPerGallon = in.nextInt();
            System.out.println("You entered " + milesPerGallon + " miles per gallon.");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid entry " + trash);
        }

        System.out.println("Enter the price of gas per gallon: ");
        if (in.hasNextDouble())
        {
            priceOfGas = in.nextDouble();
            System.out.println("You entered dollars " + priceOfGas + " per gallon");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid entry " + trash);
        }
        totalPerMiles = gallonsOfGas * milesPerGallon;
        costPerMileage = priceOfGas / milesPerGallon;
        costForTravel = costPerMileage * TRAVELED_MILEAGE;
        System.out.println("With a full tank, you would be able to travel " + totalPerMiles + " miles.");
        System.out.println("The cost per mile is " + costPerMileage + " and if you were to travel 100 miles the cost would be $" + costForTravel);

    }
}