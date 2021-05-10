import java.util.*;
class Sumnnumbers
{
	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many numbers want to sum:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("You have entered "+n+" digits to be added");
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the number"+(i+1)+":");
			 a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum of "+n+"number is "+sum);
	}

}