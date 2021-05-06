import java.util.*;
class Parrellelogramarea
{
	public static void main(String[] args) {
		double d1,d2,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Height of the Parallelogram:");
		d1=s.nextDouble();
		System.out.println("Enter the Breadth of the Parrellelogram:");
		d2=s.nextDouble();
		area=(d1*d2);
		System.out.println("The are of the Parrellelogram is "+area);
	}

}