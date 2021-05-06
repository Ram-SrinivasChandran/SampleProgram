import java.util.*;
class Perimetercircle
{
	public static void main(String[] args) {
		double r,perimeter;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Radius of the circle:");
		r=in.nextDouble();
		perimeter=(2*22*r)/7; 
		System.out.println("The Perimeter of the Circle is:"+perimeter);
	}

}