import java.util.Scanner;

public class SwitchExample {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int choice;

System.out.println("=== Smart Home Control Panel ===");

while (true) {
System.out.println("\nSelect a Mode:");
System.out.println("1. Morning Mode");
System.out.println("2. Party Mode");
System.out.println("3. Security/Away Mode");
System.out.println("0. Exit System");
System.out.print("Enter your choice: ");
            
choice = input.nextInt();

// The 'break' inside the switch exits the switch block.
// The 'break' outside the switch (in the if) exits the while loop.
if (choice == 0) {
System.out.println("Shutting down Smart Home system...");
break; 
}

switch (choice) {
case 1:
System.out.println(">> Morning Mode: Opening blinds and starting coffee maker.");
break; // Required to stop it from falling through to Case 2

case 2:
System.out.println(">> Party Mode: Dimming lights and playing music.");
break;

case 3:
System.out.println(">> Security Mode: Locking all doors and activating cameras.");
break;

default:
System.out.println(">> Error: Invalid mode selected. Please try again.");
// No need for 'continue' here, it will naturally loop back
}
}

input.close();
}
}