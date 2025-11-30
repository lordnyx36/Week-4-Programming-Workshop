import java.util.Scanner;

/**
 * Solve the above Q.6 by using switch statement
 * @author Karan Khatiwada
 * @version 28/11/2025
 */
public class Question_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to give discount according to user guess");
        System.out.println("------------------------------------------------\n");
        System.out.println("Enter the total shopping bill : ");
        float mp = sc.nextFloat();
        System.out.println("Enter your choice A,B,C,D");
        char choice = sc.next().charAt(0);
        switch(choice)
        {
            case 'A':
                System.out.println("The price before discount "+ mp + " after discount is " + (mp-(mp*0.6)));
                break;
            case 'B':
                System.out.println("The price before discount "+ mp + " after discount is " + (mp-(mp*0.4)));
                break;
            case 'C':
                System.out.println("The price before discount "+ mp + " after discount is " + (mp-(mp*0.2)));
                break;
            case 'D':
                System.out.println("The price before discount "+ mp + " after discount is " + (mp-(mp*0.1)));
                break;
            default:
                System.out.println("Enter valid choice or get out");
        }
        System.out.println("Thank you!!");
    }
}