import java.util.Scanner;

/**
 * Write a program to determine if a student has passed or failed and examination
 *
 * @author Karan Khatiwada
 * @version 28/11/2025
 */
public class Question_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to calcualte if the user passed or failed!!");
        System.out.println("---------------------------------------------------\n");
        System.out.println("Enter the Marks obtained in examination out of 100");
        double obtainedMark = sc.nextDouble();
        if(obtainedMark < 40)
        {
            if(obtainedMark < 0) 
            {
                System.out.println("Enter valid Mark !!!");
            }
            else
            {
                System.out.println("You have failed the exam :( ");
            }
        }
        else
        {
            if(obtainedMark > 100)
            {
                System.out.println("Enter valid Mark !!!");
            }
            else
            {
                System.out.println("You have Passed the exam :) ");
            }
        }
    }
    
}