import java.util.Scanner;

/**
 * Write a program to check whether the given number is either even or odd.
Hint: Use modulus (%) operator
 *
 * @author Karan Khatiwada
 * @version 28/11/2025
 */
public class Question_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if number is odd or even");
        System.out.println("-----------------------------------------\n");
        System.out.println("Enter a number to check odd or even");
        int number = sc.nextInt();
        if(number <=0)
        {
            if(number == 0)
            {
                System.out.println("The number is zero ");
            }
            else
            {
                System.out.println("The number is negative ");
            }
            
        }
        else if(number >0)
        {
            if(number % 2 == 0)
            {
                System.out.println("The number " + number + " is even");
            }
            else
            {
                System.out.println("The number "+number+" is odd");
            }
        }
    }
}