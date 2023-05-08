// II. Write a program to check whether the customer have discount 
//(get 20% discount if total amount is greater than 5000) or not
// and get the final amount in main method. (Static methods)
// a) Get prices of items using parameterized method 
//b) Method 1 - Calculate total amount 
//c) Method 2 - Check discount
//java
import java.util.*;
public class CustomerDiscount
{
	static float quantity,price,amount,discount;
	public static float totalamount(float quan,float pri)
	{
		quantity = quan;
		price = pri;
		amount = quantity * price;
		System.out.println("total amount is: "+amount);
		return amount;		
	}
	public 	static float discountper(float disc)
	{		
		discount = disc;		
		if(amount > 5000)	
		{
		    discount=(amount*discount)/100;
			amount=amount-discount;			
		}
		return amount;
	}	
	public static void display()                   
	{
			
		System.out.println("final amount: "+amount);
	}	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Price Of The Product:");
		float price1=sc.nextFloat();
        System.out.println("Enter The No Of Quantity:"); 
		float quantity1=sc.nextFloat();  
		float result1 = CustomerDiscount.totalamount(price1,quantity1);
		
		System.out.println("Enter The Discount If total is greater than 5000 Else enter 0: ");
		float dis = sc.nextFloat();
		float result2 =CustomerDiscount.discountper(dis);

		CustomerDiscount.display();
		
		
		
	}
}