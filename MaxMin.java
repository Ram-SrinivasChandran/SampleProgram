import java.util.*;
class MaxMin
{
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		a=s.nextInt();
		System.out.println("Enter the 2nd Number:");
		b=s.nextInt();
		int c=maxmin(a,b);
		System.out.println("Max number:"+c);

	}
	public static int maxmin(int a,int b)
	{
		int c;
		if(a>b)
		{
			c=a;
		}
		else
		{
			c=b;
		}
		return c;
	}

}