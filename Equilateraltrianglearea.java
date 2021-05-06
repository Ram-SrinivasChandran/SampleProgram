import java.util.*;
class Equilateraltrianglearea
{
	public static void main(String[] args) {
		double a,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sides of the Triangle:");
		a=s.nextDouble();
		area=(Math.sqrt(3)/4*(a*a));
		System.out.println("The area of the Rhombus is "+area);
	}

}