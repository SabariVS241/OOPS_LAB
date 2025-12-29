public class Find_Avg
{
public int findAvg(int numA, int numB, int numC)
{
return (numA + numB + numC) / 3;
}
public static void main(String args[])
{
Find_Avg obj = new Find_Avg();
int avg = obj.findAvg(60, 20, 40);
System.out.println("Average of 60, 20 and 40 is : " + avg);
}
}
