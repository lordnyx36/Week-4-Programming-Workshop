import java.util.Scanner;

/**
 * Scholarship Eligibility Checker
 *
 * @author Karan Khatiwada
 * @version 28/11/2025
 */
public class Question_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check eligiblity for scholarship");
        System.out.println("-------------------------------------------\n");
        System.out.println("Enter the total gpa : ");
        float gpa = sc.nextFloat();
        System.out.println("Enter the total attance in % : ");
        float attendance = sc.nextFloat();
        System.out.println("Enter the total attitude score form 1-10 : ");
        int attitude = sc.nextInt();
        if(gpa >=3.2)
        {
            if(attendance > 80)
            {
                if(attitude < 5)
                {
                    System.out.println("Student is eligible for scholorship");
                }
            }
        }
        else
        {
            System.out.println("Student is not eligible for scholorshi");
        }

    }
}