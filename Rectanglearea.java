import java.util.*;
class Rectanglearea
{
	public static void main(String[] args) {
		double l,b,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle:");
		l=s.nextDouble();
		System.out.println("Enter the Breadth of the Rectangle:");
		b=s.nextDouble();
		area=(l*b);
		System.out.println("The are of the Rectangle is "+area);
	}

}