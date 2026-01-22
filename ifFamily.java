import java.util.Scanner;

public class ifFamily {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("--- Welcome to the Digital Library ---");
System.out.print("Are you a member? (true/false): ");
boolean isMember = input.nextBoolean();

System.out.print("Enter your age: ");
int age = input.nextInt();

// 1. NESTED-IF (Checks membership first, then checks age inside)
if (isMember) {
System.out.println("Membership Verified.");
            
if (age >= 18) {
System.out.println("Access granted to the Adult Research Wing.");
} else {
System.out.println("Access granted to the Junior Learning Center.");
}

// 2. IF-ELSE-IF LADDER (Decides discount based on age)
double discount;
if (age < 12) {
discount = 50.0; // Children get 50% off
} else if (age >= 60) {
discount = 30.0; // Senior citizens get 30% off
} else if (age <= 25) {
discount = 15.0; // Students get 15% off
} else {
discount = 0.0;  // Standard adults pay full price
}
System.out.println("Your membership discount is: " + discount + "%");

} else {
// 3. IF-ELSE (Handles the case for non-members)
System.out.println("Guest Access Only. Please sign up for a full membership.");
}

// 4. SIMPLE IF (A standalone check for a specific safety rule)
if (age < 5) {
System.out.println("Note: Children under 5 must be accompanied by a guardian.");
}

System.out.println("Thank you for visiting!");
input.close();
}
}