import java.util.Scanner;

public class While {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double accountBalance = 5000.00; // Starting balance
        
System.out.println("Welcome to the Alpha Bank ATM");
System.out.println("Your current balance is: $" + accountBalance);

while (true) { 
// Infinite loop until a successful transaction or exit
System.out.print("\nEnter amount to withdraw (or 0 to cancel): ");
double withdrawalAmount = input.nextDouble();

// Jump Statement: BREAK
if (withdrawalAmount == 0) {
System.out.println("Transaction cancelled. Have a nice day!");
break; 
}

// Jump Statement: CONTINUE
if (withdrawalAmount < 0) {
System.out.println("Error: Invalid amount. Please enter a positive value.");
continue; // Skips the rest of the code and asks for input again
}

if (withdrawalAmount > accountBalance) {
System.out.println("Error: Insufficient funds. You only have $" + accountBalance);
continue; // Skips to the next iteration to let the user try a smaller amount
}

// Processing successful withdrawal
accountBalance -= withdrawalAmount;
System.out.println("Success! Please collect your cash.");
System.out.println("Remaining balance: $" + accountBalance);
            
// Jump Statement: BREAK
break; // Transaction finished, exit the loop
}

System.out.println("\n--- Thank you for using our ATM ---");
input.close();
}
}