import java.util.*;
class Circlearea
{
	public static void main(String[] args) {
		double r,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		r=s.nextDouble();
		area=(22*r*r)/7;
		System.out.println("The are of the circle is "+area);
	}

}