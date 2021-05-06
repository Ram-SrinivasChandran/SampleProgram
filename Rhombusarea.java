import java.util.*;
class Rhombusarea
{
	public static void main(String[] args) {
		double d1,d2,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Diagonal 1:");
		d1=s.nextDouble();
		System.out.println("Enter Diagonal 2:");
		d2=s.nextDouble();
		area=(d1*d2)/2;
		System.out.println("The area of the Rhombus is "+area);
	}

}