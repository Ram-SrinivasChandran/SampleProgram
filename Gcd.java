public class Gcd
{
	public static void main(String[] args) {
		int a=81,b=153;
		int gcd=1;
		for(int i=1;i<=a&&i<=b;++i)
		{
			
			if(a%i==0&&b%i==0)
				gcd=i;

		}
		System.out.println("The Gcd of "+a+" and "+b+" is "+gcd);
	}
}