public class Armstrongnumbers
{
	public static void main(String[] args) {
		int r=0,a,temp;
		int n=153;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			r=r+(a*a*a);
		}
	if(temp==r)
	{
		System.out.println("Armstrong number");
	}else
	{
		System.out.println("Not Armstrong number");
	}
	}
}