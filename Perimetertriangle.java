import java.util.*;
class Perimetertriangle
{
	public static void main(String[] args) {
		double a,perimeter;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the side of the triangle:");
		a=in.nextInt();
		perimeter=3*a;
		System.out.println("The Perimeter of the Triangle is "+perimeter);
	}
}