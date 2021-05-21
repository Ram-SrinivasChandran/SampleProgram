import java.util.*;
class Positivenegativewithoutmain
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		a=s.nextInt();
		System.out.println("Enter the Second Number: ");
		b=s.nextInt();
		System.out.println("Enter the Third Number: ");
		c=s.nextInt();
		checkNumber(a);
		checkNumber(b);
		checkNumber(c);
	
}
	public static int checkNumber(int number)
	{
		if(number>0)
		{
			System.out.println("Positive");
		}
		else if(number<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	return 0;
	}
 }

