import java.util.Scanner;
class Alphabet{
	public static void main(String[] args) {
		char a;
		Scanner in=new Scanner (System.in);
		System.out.println("Enter a Character:");
		a=in.next().charAt(0);
		if((a>='a'&&a<='z')||(a>='A'&&a<='z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not a Alphabet");
		}
	}
}