import java.util.Scanner;

/**
 * Solve same question no 4) by using nested if.
 *
 * @author Karan Khatiwada
 * @version 28/11/2025
 */
public class Question_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if number is divisible by 3 and 5 or not");
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Enter a number to check either it is divisible by 3 and 5 or not");
        int num = 14;
        if(num % 3 == 0)
        {
            if(num % 5 == 0)
            {
                System.out.println("The number " + num + " is divisible by both 3 & 5.");
            }
            else
            {
                System.out.println("The number " + num + " is divisible by 3 only.");
            }
        }
        else if(num % 5==0)
        {
            if(num % 3 == 0)
            {
                System.out.println("The number " + num + " is divisible by both 3 & 5.");
            }
            else
            {
                System.out.println("The number " + num + " is divisible by 5 only.");
            }
        }
        else
        {
            System.out.println("The number " + num + " is neither divisible by 3 nor by 5.");
        }
    }
}