//java program to swap 2 numbers without temperory variables
public class Swapwithouttemp
{
public static void main(String[] args)
{
int x,y;
x=10;
y=20;
System.out.println("before swapping: ");
System.out.println("num1: "+x );
System.out.println("num2: "+y);
x+=y;//30
y=x-y;//10
x-=y;//20
System.out.println("after swapping: ");
System.out.println("num1: "+x );
System.out.println("num2: "+y);
}
}