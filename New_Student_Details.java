public class New_Student_Details {
public static void main(String[] args) {
        
// === INTEGER DATA TYPES ===
byte batch_year;           // 1 byte 
short roll_no;             // 2 bytes 
int age;                   // 4 bytes 
long contact_no;           // 8 bytes 
        
// === FLOATING POINT DATA TYPES ===
float cgpa;                // 4 bytes 
double percentage;         // 8 bytes 
        
// === CHARACTER DATA TYPE ===
char section;              // 2 bytes 
        
// === BOOLEAN DATA TYPE ===
boolean is_scholarship;    // 1 bit (true/false)
        
// Assigning realistic student values
batch_year = 25;           
roll_no = 25241;           
age = 18;
contact_no = 9344493859L;  // Note 'L' suffix for long
cgpa = 9.32f;              // Note 'f' suffix for float
percentage = 90.75;
section = 'C';
is_scholarship = true;
        
// Display all student details with data type info
System.out.println("=== STUDENT DETAILS USING ALL PRIMITIVE DATA TYPES ===");
System.out.println("Batch Year (byte): " + batch_year);
System.out.println("Roll No (short): " + roll_no);
System.out.println("Age (int): " + age);
System.out.println("Contact No (long): " + contact_no);
System.out.println("CGPA (float): " + cgpa);
System.out.println("Percentage (double): " + percentage + "%");
System.out.println("Section (char): " + section);
System.out.println("Has Scholarship (boolean): " + is_scholarship);
        
}
}