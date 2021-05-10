import java.util.*;
class Volumesphere
{
	public static void main(String[] args) {
		double r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		r=s.nextDouble();
		double volume=(4*22*r*r*r)/(3*7);
		System.out.println("The Volume of the Sphere is:"+volume);
	}
}