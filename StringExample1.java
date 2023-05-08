public class StringExample1
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("hello");
		System.out.println("length: "+sb.length());
		sb.append("world");
		System.out.println("append : "+sb);
		sb.insert(5,"-");
		System.out.println("insert: "+sb);
		sb.reverse();
		System.out.println("reverse: "+sb);
	}
}