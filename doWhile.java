import java.util.Scanner;

public class doWhile {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int ticketsBooked = 0;
int maxTicketsPerPerson = 6;
        
// FIX: Initialize the variable with an empty string
String choice = ""; 

System.out.println("--- Welcome to CineWorld Booking ---");

do {
System.out.print("\nEnter age of the viewer (or 0 to cancel booking): ");
int age = input.nextInt();

if (age == 0) {
System.out.println("Booking cancelled by user.");
break;
}

if (age < 3) {
System.out.println(">> Infant detected: Entry is free. No ticket needed.");
                
// We still need to ask if they want another ticket before continuing
System.out.print("Add another ticket? (yes/no): ");
choice = input.next().toLowerCase();
continue; 
}

ticketsBooked++;
System.out.println(">> Success: Ticket #" + ticketsBooked + " added to your cart.");

if (ticketsBooked >= maxTicketsPerPerson) {
System.out.println("!! Limit Reached: You cannot book more than " + maxTicketsPerPerson + " tickets.");
break;
}

System.out.print("Add another ticket? (yes/no): ");
choice = input.next().toLowerCase();

} while (choice.equals("yes"));

System.out.println("\nTotal Tickets Booked: " + ticketsBooked);
System.out.println("Thank you for choosing CineWorld!");
input.close();
}
}