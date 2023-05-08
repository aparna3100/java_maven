// java Program to find the reverse of a number
// i)Two constructors, one for calculation reverse and other for display Finding reverse
// ii) Argument variable and instance variable should be same 
//iii) Main method allows to invoke only one constructor
// this keyword

public class ReverseNum 
{
	int number;
	int reminder,reverse=0;
	public ReverseNum(int number)
	{
		this();
		this.number=number;
		while(number!=0)
		{
		reminder = number % 10;
		reverse = reverse * 10 + reminder;
		number = number / 10;
		}
	}
	public ReverseNum()
	{
		this(4567);
		System.out.println("reverse: "+reverse);
	}
	
	public static void main(String[] args)
	{	
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter the number: ");
		//int num = sc.nextInt();
		System.out.println("The number is 4567 ");
		ReverseNum obj = new ReverseNum(num);
		
	}
	
}
