import java.util.*;
class Isoscelesarea
{
	public static void main(String[] args) {
		double a,b,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length of same sided of triangle:");
		a=s.nextDouble();
		System.out.println("Enter the Side 2 the triangle:");
		b=s.nextDouble();
		area=(b/4)*Math.sqrt((4*a*a)-(b*b));
		System.out.println("The are of the Rectangle is "+area);
	}

}