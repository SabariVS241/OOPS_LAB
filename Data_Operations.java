public class Data_Operations {
public static void main(String[] args) {
int a = 20, b = 6;
boolean x = true, y = false;
        
System.out.println("=== ARITHMETIC OPERATORS ===");
System.out.println("a + b = " + (a + b));     // Addition
System.out.println("a - b = " + (a - b));     // Subtraction  
System.out.println("a * b = " + (a * b));     // Multiplication
System.out.println("a / b = " + (a / b));     // Division
System.out.println("a % b = " + (a % b));     // Modulus
        
System.out.println("\n=== UNARY OPERATORS ===");
System.out.println("Original a: " + a);
a++;  // Increment
System.out.println("After a++: " + a);
a--;  // Decrement  
System.out.println("After a--: " + a);
        
System.out.println("\n=== RELATIONAL OPERATORS ===");
System.out.println("a < b: " + (a < b));
System.out.println("a <= b: " + (a <= b));
System.out.println("a > b: " + (a > b));
System.out.println("a >= b: " + (a >= b));
System.out.println("a == b: " + (a == b));
System.out.println("a != b: " + (a != b));
        
System.out.println("\n=== LOGICAL OPERATORS ===");
System.out.println("x && y: " + (x && y));
System.out.println("x || y: " + (x || y));
System.out.println("!x: " + (!x));
System.out.println("!y: " + (!y));
}
}