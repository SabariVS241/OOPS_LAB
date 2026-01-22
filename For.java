import java.util.Scanner;

public class For {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int maxAttempts = 3;
boolean couponApplied = false;

System.out.println("--- Checkout: Apply Promo Code ---");
System.out.println("You have " + maxAttempts + " attempts to enter a valid code.");

// The 'For' loop is ideal here because we have a fixed limit of 3 tries
for (int i = 1; i <= maxAttempts; i++) {
System.out.print("\nAttempt #" + i + " - Enter Code: ");
String code = input.next().toUpperCase();

// 1. Jump Statement: CONTINUE
// If the code is 'SAVE10', we tell them it's expired and skip to the next attempt
if (code.equals("SAVE10")) {
System.out.println(">> Notice: This code expired yesterday. Try another one.");
continue; // Skips the rest of this loop and increments 'i'
}

// 2. Jump Statement: BREAK
// If the code is correct, we stop the loop immediately
if (code.equals("FREESHIP") || code.equals("WELCOME20")) {
System.out.println(">> Success! Promo code applied to your order.");
couponApplied = true;
break; // Exit the loop entirely
}

// Standard message if code doesn't match anything
System.out.println(">> Error: Invalid code.");
}

if (couponApplied) {
System.out.println("\nOrder Total Updated. Proceeding to payment...");
} else {
System.out.println("\nNo valid codes applied. Proceeding with original price.");
}

input.close();
}
}