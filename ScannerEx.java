//scanner example in java 
import java.util.Scanner;
public class ScannerEx
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int num;
String name;
float num1;
char ch;

System.out.println("enter number: ");
num = sc.nextInt();
System.out.println("enter name: ");
sc.nextLine();
name = sc.nextLine();
System.out.println("enter float number: ");
num1 = sc.nextFloat();
System.out.println("enter character: ");
ch = sc.next().charAt(0);

System.out.println(" name: "+name);
System.out.println(" number: "+num);
System.out.println(" number1: "+num1); 
System.out.println("char: "+ch);
}
}


