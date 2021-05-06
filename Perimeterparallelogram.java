import java.util.*;
class Perimeterparallelogram
{
public static void main(String[] args) {
	double h,b,perimeter;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Height of Parallelogram:");
	h=in.nextDouble();
	System.out.println("Enter the Breadth of Parallelogram:");
	b=in.nextDouble();
	perimeter=2*(h+b);
	System.out.println("The Perimeter of the Parallelogram is "+perimeter);
}
}