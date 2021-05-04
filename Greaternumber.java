import java.util.Scanner;
public class Greaternumber
{
	public static void main(String[] args) {
		double a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=in.nextDouble();
		System.out.println("Enter a number:");
		b=in.nextDouble();
		System.out.println("Enter a number:");
		c=in.nextDouble();
		if(a>=b&&a>c)
		{
			System.out.println("Greate number is a");
		}else if(b>=c&&b>=a)
		{
			System.out.println("Greate number is b");
		}else
		{
			System.out.println("Greate number is c");
		}
		
	}
}