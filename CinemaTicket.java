/**
 * CinemaTicket.java
 * @Author: Karan Khatiwada
 * @Version: 30-11-2025
 */
import java.util.Scanner;
public class CinemaTicket {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("XFX Cinema Ticket Calculator");
        System.out.print("Enter age group (child/adult/senior): ");
        String ageGroup = sc.nextLine().toLowerCase();
        System.out.print("Enter movie language (nepali/hindi/english): ");
        String language = sc.nextLine().toLowerCase();
        System.out.print("Are you a student? (yes/no): ");
        String isStudent = sc.nextLine().toLowerCase();
        System.out.print("Is it a festival day? (yes/no): ");
        String isFestival = sc.nextLine().toLowerCase();
        double price = 0;
        switch (ageGroup) 
        {
            case "child": price = 150; break;
            case "adult": price = 250; break;
            case "senior": price = 200; break;
            default: System.out.println("Invalid age group!"); return;
        }
        switch (language) 
        {
            case "nepali": break;
            case "hindi": price += 50; break;
            case "english": price += 100; break;
            default: System.out.println("Invalid movie language!"); return;
        }
        if(isStudent.equals("yes"))
        {
            price -= price * 0.20;
        }
        if(isFestival.equals("yes"))
        {
            price -= price * 0.15;
        }
        System.out.println("Final Ticket Price: Rs. " + price);
        System.out.println("--------------------------------");
        sc.close();
    }
}
