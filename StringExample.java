public class StringExample
{
	public static void main(String[] args)
	{
		String str1=new String("hello");                    
		String str2=new String("HELLO");
		System.out.println("equal : "+str1.equals(str2));
		int len=str1.length();
		System.out.println("length :"+len);
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("equal string");
		}
		else
		{
			System.out.println("not equal ");
		}
		char ch=str1.charAt(2);
		System.out.println("charachter : "+ch);
		int num=100;
		String con=String.valueOf(num);
		System.out.println(con);
		System.out.println(con.length());
		String concat = str1.concat(str2);
		System.out.println("concat : "+concat);
		
	}
}