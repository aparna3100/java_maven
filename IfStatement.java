//simple if
import java.util.*;
public class IfStatement
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int number;
System.out.println("enter number: ");
number = sc.nextInt();
if(number<=20)
{
	number+=20;
}
else
{
	number-=10;
}
System.out.println("number: "+number);
}
}
