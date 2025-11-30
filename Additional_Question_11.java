import java.util.Scanner;

/**
 * The Government of Nepal applies a progressive tax system for individuals.
 * Below are the income tax brackets and corresponding tax rates for single
 * taxpayers. Your task is to create a Java program that calculates the income tax
 * based on these brackets.
 *
 * @author Karan Khatiwada
 * @version 30/11/2025
 */
public class Additional_Question_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Program to find the tax of each income");
            System.out.print("Enter your salary: ");
            double salary = sc.nextDouble();
            double taxAmount = 0;
            double taxableAmount;

            if (salary <= 500000) {
                taxAmount = salary * 0.01;
            }
            else if (salary <= 700000) {
                taxableAmount = salary - 500000;
                taxAmount = 5000 + (taxableAmount * 0.10);
            }
            else if (salary <= 1000000) {
                taxableAmount = salary - 700000;
                taxAmount = 25000 + (taxableAmount * 0.20);
            }
            else if (salary <= 2000000) {
                taxableAmount = salary - 1000000;
                taxAmount = 85000 + (taxableAmount * 0.30);
            }
            else if (salary <= 5000000) {
                taxableAmount = salary - 2000000;
                taxAmount = 385000 + (taxableAmount * 0.36);
            }
            else {
                taxableAmount = salary - 5000000;
                taxAmount = 1445000 + (taxableAmount * 0.39);
            }

            System.out.println("Your total tax to pay = Rs. " + taxAmount);

            System.out.print("\nDo you want to retry? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');
    }
}
