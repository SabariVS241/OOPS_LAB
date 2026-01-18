public class Main {
public static void main(String[] args) {

// --- SECTION 1: PRINTING ON SAME LINE ---
System.out.println("--- Section 1 (print) ---");
System.out.print("I like pizza!");
System.out.print("It's really good!");
System.out.print("Buy me pizza!");
        
System.out.println("\n\n--- Section 2 (\\n) ---");

// --- SECTION 2: USING ESCAPE SEQUENCE \n ---
System.out.print("I like pizza!\n");
System.out.print("It's really good!\n");
System.out.print("Buy me pizza!\n");

System.out.println("\n--- Section 3 (println) ---");

// --- SECTION 3: USING println ---
System.out.println("I like pizza!");
System.out.println("It's really good!");
System.out.println("Buy me pizza!");
}
}

/*
This program demonstrates Java's console output methods.
It compares System.out.print() vs. System.out.println() 
and shows how to use the \n escape sequence for line breaks.
*/