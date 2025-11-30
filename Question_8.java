import java.util.Scanner;

/**
 * GPA to Grade Conversion
 *
 * @author Karan Khatiwada)
 * @version 28/11/2025
 */
public class Question_8
{
    public static void main(String[] args)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to convert gpa into grade");
        System.out.println("---------------------------------\n");
        System.out.println("Enter the total gpa : ");
        float gpa = sc.nextFloat();
        if(gpa < 1.6)
        {
            System.out.println("You have failed You got F");
        }
        else if(gpa > 1.6 && gpa < 2.0)
        {
            System.out.println("You have failed You got D");
        }
        else if(gpa > 2.0 && gpa < 2.4)
        {
            System.out.println("You have failed You got C");
        }
        else if(gpa > 2.4 && gpa < 2.8)
        {
            System.out.println("You have failed You got C+");
        }
        else if(gpa > 2.8 && gpa < 3.2)
        {
            System.out.println("You have failed You got B ");
        }else if(gpa > 3.2 && gpa < 3.6)
        {
            System.out.println("You have failed You got A");
        }else if(gpa > 3.6 && gpa < 4)
        {
            System.out.println("You have failed You got A+");
        }
        System.out.println("Thank You!!");
    }
}