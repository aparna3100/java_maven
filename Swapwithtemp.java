//java program to swap 2 numbers with temperory variables
public class Swapwithtemp
{
public static void main(String[] args)
{
int x,y;
x=10;
y=20;
System.out.println("before swapping: ");
System.out.println("num1: "+x );
System.out.println("num2: "+y);
int temp=x=10;
x=y=20;
y=temp=10;
System.out.println("after swapping: ");
System.out.println("num1: "+x);
System.out.println("num2: "+y);
}
}

