import java.util.*;
class Addingtwonumbers
{
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		a=s.nextInt();
		System.out.println("Enter 2nd Number:");
		b=s.nextInt();
		c=addnum(a,b);
		System.out.println("Sum of Two Numbers="+c);

	}
	public static int addnum(int a,int b)
	{
		int c=a+b;
		//System.out.println(c);
	return c;
}

}