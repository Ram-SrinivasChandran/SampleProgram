import java.util.*;
public class Reverse {
public static void main(String[] args) {
	int a,reverse=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number to be reversed:");
    a=in.nextInt();
    while(a!=0)
    {
    	int digit=a%10;
        reverse=reverse*10+digit;
        a/=10;

    }
    System.out.println("The reverse of the number is:"+reverse);
}
}