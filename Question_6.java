import java.util.Scanner;

/**
 * Write a program to display the selling price of the item according to
the given discount percent which is based on the different categories
 *
 * @author Karan Khatiwada
 * @version 28/11/2025
 */
public class Question_6
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
        if(choice == 'A' || choice == 'a')
        {
            System.out.println("The price before discount "+ mp + " after discount is " + (mp-(mp*0.6)));
        }
        else if(choice == 'B'|| choice == 'a')
        {
            System.out.println("The price before discount "+ mp + " after discount is " + (mp-(mp*0.4)));
        }
        else if(choice == 'C')
        {
            System.out.println("The price before discount "+ mp + " after discount is " + (mp-(mp*0.2)));
        }
        else if(choice == 'D')
        {
            System.out.println("The price before discount "+ mp + " after discount is " + (mp-(mp*0.1)));
        }
        else
        {
            System.out.println("Enter valid choice or get out");
        }
        System.out.println("Thank you!!");
    }
}