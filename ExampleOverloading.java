import java.util.*;
class ExampleOverloading
{
	public static void main(String[] args) {	
	int a,b;
	double c,d;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	a=s.nextInt();
	System.out.println("Enter the number:");
	b=s.nextInt();
	System.out.println("Enter the number:");
	c=s.nextDouble();
	System.out.println("Enter the number:");
	d=s.nextDouble();
	int g=minmax(a,b);
	System.out.println("Max value="+g);
	double h=minmax(c,d);
	System.out.println("Max value="+h);
	int e=maxmin(a,b);
	System.out.println("Min value="+e);
	double f=maxmin(c,d);
	System.out.println("Min value="+f);
}
	public static int minmax(int a,int b) 
	{
		int max;
		if(a>b)
		{
			max=a;
		}
		else
		{
			max=b;
		}
		return max;
	}
	public static double minmax(double c,double d) 
	{
		double max;
		if(c>d)
		{
			max=c;
		}
		else
		{
			max=d;
		}
		return max;
	}
	public static int maxmin(int a,int b) 
	{
		int min;
		if(a<b)
		{
			min=a;
		}
		else
		{
			min=b;
		}
		return min;
	}
	public static double maxmin(double c,double d)
	{
		double min;
		if(c<d)
		{
			min=c;
		}	
		else
		{
			min=d;
		}
		return min;
	}
}