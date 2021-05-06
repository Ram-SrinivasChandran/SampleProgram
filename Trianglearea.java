import java.util.*;
class Trianglearea
{
	public static void main(String[] args) {
		double b,h,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Base of the triangle");
		b=s.nextDouble();
		System.out.println("Enter the Height of the triangle");
		h=s.nextDouble();
		area=(b*h)/2;
		System.out.println("The are of the Triangle is "+area);
	}

}