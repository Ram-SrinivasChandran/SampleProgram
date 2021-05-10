import java.util.*;
class Electricbill
{public static void main(String[] args) {
	int a;
	double billpay=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the current unit:");
	a=s.nextInt();
	if(a<100)
	{
		System.out.println("Bill to pay:"+(a*1.20));
	}else if(a<300)
	{
		System.out.println("Bill to pay:"+(100*1.20+(a-100)*2));
	} else if(a>300)
	{
		System.out.println("Bill to pay:"+(100*1.20+200*2+(a-300)*3));
	}

}
	
}