//java program to input as command line arguments
//example 2
public class Commandlineargs
{
  public static void main(String args[])
{ 
   int height;
   int base;
   int res;
   height=Integer.parseInt(args[0]);
   base=Integer.parseInt(args[1]);
   res=(height*base)/2;
   System.out.println("first argument: "+args[0]);
   System.out.println("second argument: "+args[1]);
   System.out.println("res: " +res);
}
}