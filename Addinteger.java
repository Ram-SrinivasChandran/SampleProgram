import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0,b=0,c=0,ans=0;
		while(a>0)
		{
		    b=a%10;
		    sum=sum+b;
		    b=0;
		    a=a/10;
		}
		while(sum>0)
		{
		   c=sum%10;
		   ans=ans+c;
		   c=0;
		   sum=sum/10;
		   
		}
		System.out.println(ans);
	}
}
