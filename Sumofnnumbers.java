import java.util.*;
class Sumofnnumbers
{
	public static void main(String[] args) {
		int num,answer;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of digit to be added:");
		num=s.nextInt();
		switch(num)
		{
			case 1:
			int a;
			System.out.println("Enter the number:");
			a=s.nextInt();
			answer=a;
			System.out.println("The answer is:"+answer);
			break;

			case 2:
			int b,c;
			System.out.println("Enter the number:");
			b=s.nextInt();
			System.out.println("Enter the number:");
			c=s.nextInt();
			answer=b+c;
			System.out.println("The answer is:"+answer);
			break;

			case 3:
			int d,e,f;
			System.out.println("Enter the number:");
			d=s.nextInt();
			System.out.println("Enter the number:");
			e=s.nextInt();
			System.out.println("Enter the number:");
			f=s.nextInt();
			answer=d+e+f;
			System.out.println("The answer is:"+answer);
			break;		
		
			case 4:
			int g,h,i,j;
			System.out.println("Enter the number:");
			g=s.nextInt();
			System.out.println("Enter the number:");
			h=s.nextInt();
			System.out.println("Enter the number:");
			i=s.nextInt();
			System.out.println("Enter the number:");
			j=s.nextInt();
			answer=g+h+i+j;
			System.out.println("The answer is:"+answer);
			break;

			case 5:
			int k,l,m,n,o;
			System.out.println("Enter the number:");
			k=s.nextInt();
			System.out.println("Enter the number:");
			l=s.nextInt();
			System.out.println("Enter the number:");
			m=s.nextInt();
			System.out.println("Enter the number:");
			n=s.nextInt();
			System.out.println("Enter the number:");
			o=s.nextInt();
			answer=k+l+m+n+o;
			System.out.println("The answer is:"+answer);
			break;
			case 6:
			int p,q,r,t,u,v;
			System.out.println("Enter the number:");
			p=s.nextInt();
			System.out.println("Enter the number:");
			q=s.nextInt();
			System.out.println("Enter the number:");
			r=s.nextInt();
			System.out.println("Enter the number:");
			t=s.nextInt();
			System.out.println("Enter the number:");
			u=s.nextInt();
			System.out.println("Enter the number:");
			v=s.nextInt();
			answer=p+q+r+t+u+v;
			System.out.println("The answer is:"+answer);
			break;
			default:
			System.out.println("Wrong entry");
	}

}
}