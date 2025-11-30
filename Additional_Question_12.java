import java.util.Scanner;

/**
 * The Government of Nepal applies a progressive tax system for individuals.
 * Below are the income tax brackets and corresponding tax rates for single
 * taxpayers. This program calculates the total income tax payable based
 * on slab-wise progressive tax rates.
 *
 * @author Karan Khatiwada
 * @version 30/11/2025
 */
public class Additional_Question_12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Program to calculate income tax based on progressive slabs.");
            System.out.print("Enter your annual income: ");
            double salary = sc.nextDouble();
            double tax = 0;
            if (salary > 500000) 
            {
                tax += 500000 * 0.01;
            } else {
                tax += salary * 0.01;
            }
            if (salary > 500000) 
            {
                double amount = Math.min(salary - 500000, 200000);
                tax += amount * 0.10;
            }
            if (salary > 700000) 
            {
                double amount = Math.min(salary - 700000, 300000);
                tax += amount * 0.20;
            }
            if (salary > 1000000) 
            {
                double amount = salary - 1000000;
                tax += amount * 0.30;
            }
            System.out.println("Your total tax payable = NPR " + tax);
            System.out.println("=====================================");
            System.out.print("\nDo you want to calculate again? (Y/N): ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
}
