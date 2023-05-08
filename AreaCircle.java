//java
// area of circle using instance method and return area
import java.util.*;
public class AreaCircle
{ 
	float area;
	public float area(float r)
	{
		
		area = 3.14f * r *r;
		return area;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		float rad = sc.nextFloat();
		AreaCircle obj = new AreaCircle();
	    float result=obj.area(rad);
		System.out.println("area is:"+result);
	}
	
}