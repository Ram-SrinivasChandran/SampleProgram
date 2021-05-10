import java.util.*;
class Volumecylinder
{
	public static void main(String[] args) {
		double r,h,volume;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius");
		r=s.nextDouble();
		System.out.println("Enter the Height:");
		h=s.nextDouble();
		volume=(22*r*r*h)/7;
		System.out.println("The Volume of the Cylinder is:"+volume);

	}
}