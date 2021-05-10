import java.util.*;
class Volumeprism
{
	public static void main(String[] args) {
		double b,h,volume;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the area of the base:");
		b=s.nextDouble();
		System.out.println("Enter the Height:");
		h=s.nextDouble();
		volume=b*h;
		System.out.println("The Volume of the Prism is:"+volume);

	}
}