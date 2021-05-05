import java.util.*;
public class Numberofdigits {
public static void main(String[] args) {
	int a,count=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a digit:");
	a=in.nextInt();
	while(a!=0)
	{
		a/=10;
		++count;
	}
	System.out.println("The digits in the given number is:"+count);
}
}