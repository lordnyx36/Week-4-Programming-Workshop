import java.util.Scanner;
/**
 * Write a program to determine if the number is positive, negative or zero.
 *
 * @author Karan Khatiwada
 * @version 28/11/2025
 */
public class Question_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if number is negative, positive or zero");
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Enter a number to check sign");
        double number = sc.nextDouble();
        if(number == 0)
        {
            System.out.println("Entered number is zero");
        }
        else if(number < 0)
        {
            System.out.println("Entered number "+number+" is negative");
        }
        else
        {
            System.out.println("Entered number "+number+" is positive");
        }
    }
}