import java.util.*;
class Perimeterrectangle
{
public static void main(String[] args) {
	double l,b,perimeter;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Length of Rectangle:");
	l=in.nextDouble();
	System.out.println("Enter the Breadth of Rectangle:");
	b=in.nextDouble();
	perimeter=2*(l+b);
	System.out.println("The Perimeter of the Rectangle is "+perimeter);
}
}