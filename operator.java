//operator example in java
public class Operator
{
  public static void main(String args[])
{ 
   int num1;
   int num2;
   int res;
   num1=Integer.parseInt(args[0]);
   num2=Integer.parseInt(args[1]);
   
   System.out.println("num1 : "+num1);
   
   System.out.println("num2 : "+num2);
   
   num1+=num2;
   
   System.out.println("new num1 : "+num1);
   
   System.out.println("num2 : "+num2);
  
}
}