//java program to input as command line arguments
//example 3
//auto increment auto decrement operators
public class Commandlineargument
{
  public static void main(String args[])
{ 
   int num1;
   int num2;
   int res;
   num1=Integer.parseInt(args[0]);
   num2=Integer.parseInt(args[1]);
   res=num1+num2;
   res++;
   System.out.println("num1 : "+args[0]);
   
   System.out.println("num2 : "+args[1]);
   System.out.println("res: " +res);
   res--;
   System.out.println("new res: "+res);
}
}