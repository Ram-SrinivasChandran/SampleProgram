import java.util.*;  
public class Alphabetstar  
{  
public static void main(String[] args)  
{  
int i, j, n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Row of the Pattern:");
n=s.nextInt();  
for (i = 0; i<=n; i++)   
{  
for (j = 0; j<= n / 2; j++)   
{  
if ((j == 0 || j == n / 2) && i != 0 ||i == 0  && j != n / 2 ||i == n / 2)   
System.out.print("*");  
else  
System.out.print(" ");  
}  
System.out.println();  
}  
}  
}  