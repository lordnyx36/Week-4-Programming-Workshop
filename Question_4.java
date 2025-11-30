import java.util.Scanner;

/**
 * Write a program to check whether the given number is either divisible by both
3 and 5 or not
 *
 * @author Karan Khatiwada
 * @version 28/11/2025
 */
public class Question_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if number is divisible by 3 and 5 or not");
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Enter the number to check number is divisible by 3 and 5 or not ");
        int number = sc.nextInt();
        if(number%3 == 0 && number%5 == 0)
        {
            System.out.println("The number "+ number + " is divisible by both 3 AND 5 ");
        }
        else if(number%3 == 0 && number%5 != 0)
        {
            System.out.println("The number "+ number + " is divisible by 3 but not by 5 ");
        }
        else if(number%3 != 0 && number%5 == 0)
        {
            System.out.println("The number "+ number + " is divisible by 5 but not by 3 ");
        }
        else
        {
            System.out.println("The number is invalid");
        }
    }
}