//java program to make deposit ,withdrawal and check balance of a account
import java.util.*;
public class Account
	{
		static double balance=100000;                   // account balance
		public static double deposit(double amount)        // makes deposit
		{
			balance = balance + amount;
			return balance;
		}
		public static double  withdraw(double amount)       // makes withdrawal
		{
			if(balance>=amount)
			{
			balance = balance - amount;
			}
			else
				System.out.println("withdraw not possible");
			return balance;
		}
		public static void display()                     // displays balance
		{
			System.out.println("balance=" + balance);
		}
		public static void main(String[] args)
		{
		System.out.print("Before transactions, ");
		Account.display();                         // display balance
		Scanner sc = new Scanner(System.in);
		System.out.println("enter deposit amount: ");
		double dep = sc.nextDouble();
		System.out.println("enter withdrawal amount: ");
		double wid = sc.nextDouble();

		double result1 = Account.deposit(dep);                    // make deposit
		double result2 = Account.withdraw(wid);                   // make withdrawal

		System.out.print("After transactions, ");
		Account.display();                         // display balance
		
		} 
			
		
	}
