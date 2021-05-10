import java.util.*;
class Discount {
	public static void main(String[] args) {
		double markedprice,disc,amount,s;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Markedprice:");
		markedprice=in.nextDouble();
		System.out.println("Enter the discount percentage");
		disc=in.nextDouble();
		s=100-disc;
		amount=(s*markedprice)/(100);
		System.out.println("The Amount to be paid after Discount "+amount);

	}
}