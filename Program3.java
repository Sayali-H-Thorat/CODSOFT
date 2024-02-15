/*Currency Selection: Allow the user to choose the base currency and the target
currency.
Currency Rates: Fetch real-time exchange rates from a reliable API.
Amount Input: Take input from the user for the amount they want to convert.
Currency Conversion: Convert the input amount from the base currency to the
target currency using the fetched exchange rate.
Display Result: Show the converted amount and the target currency symbol
to the user.*/

import java. util.Scanner;

public class Program3 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double amount = sobj.nextDouble();

        System. out.println("Choose the currency: ");
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        System.out.println("4 Pound");
        
        int choice = sobj.nextInt();
        
        switch (choice) 
        {
            case 1:Rupees_to_other(amount);
                break;

            case 2:Dollar_to_other(amount);
                break;

            case 3:Euro_to_other(amount);
                break;

            case 4:Pound_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sobj.close();

    }
    public static void Rupees_to_other(double amt)
    {
        System.out.println("1 Rupees = " + 0.012 + " Dollar");
        System.out.println();
        System.out.println(amt+" Rupees = " + (amt*0.012) + " Dollar");
        System.out.println();

        System.out.println("1 Rupees = " + 0.0096 + " Pound");
        System.out.println();
        System.out.println(amt+" Rupees = " + (amt*0.0096) + " Pound");
        System.out.println();

        System.out.println("1 Rupees = " + 0.011 + " Euro");
        System.out.println();
        System.out.println(amt+" Rupees = " + (amt*0.011) + " Euro");
    }
    public static void Dollar_to_other(double amt) 
    {
        System.out.println("1 Dollar = " + 83.05 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*83.05) + " Ruppe");
        System.out.println();

        System.out.println("1 Dollar = " + 0.80 + " Pound");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*0.80) + " Pound");
        System.out.println();

        System.out.println("1 Dollar= " + 0.93 + " Euro");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*0.93) + " Euro");
    }
    public static void Euro_to_other(double amt)
    {
        System.out.println("1 Euro = " + 89.17 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*89.17) + " Ruppe");
        System.out.println();

        System.out.println("1 Euro = " + 0.86 + " Pound");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*0.86) + " Pound");
        System.out.println();

        System.out.println("1 Euro = " + 1.07 + " Dollar");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*1.07) + " Dollar");
    }
    public static void Pound_to_other(double amt)
    {
        System.out.println("1 Pound = " + 102.24 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Pound = " + (amt*102.24) + " Ruppe");
        System.out.println();

        System.out.println("1 Pound = " + 1.17 + " Euro");
        System.out.println();
        System.out.println(amt+" Pound = " + (amt*1.17) + " Euro");
        System.out.println();

        System.out.println("1 Pound = " + 1.26 + " Dollar");
        System.out.println();
        System.out.println(amt+" Pound = " + (amt*1.26) + " Dollar");
    }
}

