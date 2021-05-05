import java.util.Scanner;
class Positivenegative
{
public static void main(String[] args) {
	double a;
	Scanner in=new Scanner(System.in);
	System.out.println("Enetr a number:");
	a=in.nextDouble();
	if(a>0)
	{
		System.out.println("Positive number.");
	}
	else if (a<0)
	{
		System.out.println("Negative number.");	
	}
	else 
	{
		System.out.println("Zero.");
	}
}
}