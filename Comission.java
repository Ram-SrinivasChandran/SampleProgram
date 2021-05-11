import java.util.*;
class Comission
{
	public static void main(String[] args) {
		double amount,commissionpeercentage,comission;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Amount:");
		amount=s.nextDouble();
		System.out.println("Enter the Commissionpeercentage:");
		commissionpeercentage=s.nextDouble();
		comission=(commissionpeercentage/100)*amount;
		System.out.println("The Comission for the amount is:"+comission);
	}

}