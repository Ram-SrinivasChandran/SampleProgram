public class Palindrome{
	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=454;
		temp=n;
		while(n>0)
		{
         r=n%10;
         n=n/10;
         sum=(sum*10)+r;
		}
		if(temp==sum)
		{
			System.out.println("The given number is a palindrome");

		}else
		{
			System.out.println("The given number is not a palindrome");
		}
	}
}