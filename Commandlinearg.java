//java program to input as command line arguments
//example 1
public class Commandlinearg
{
  public static void main(String args[])
{ 
   float num1;
   int num2;
   float res;
   num1=Float.parseFloat(args[0]);
   num2=Integer.parseInt(args[1]);
   res=num1+num2;
   System.out.println("first argument: "+args[0]);
   System.out.println("second argument: "+args[1]);
   System.out.println("res: " +res);
}
}