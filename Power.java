import java.util.*;
public class Power
{
public static void main(String[] args) {
	int base,exp;
	long result=1;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter base:");
	base=in.nextInt();
	System.out.println("Enter exponent:");
	exp=in.nextInt();
    while(exp!=0)
    {
    	result*=base;
    	--exp;
    }
    System.out.println("Answer= "+result);
}
}