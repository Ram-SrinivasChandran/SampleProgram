import java.util.*;
class Downtriangle
{
	public static void main(String[] args) {
 	int i,j,k,row;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Row of the Pattern:");
	row=s.nextInt();
	for (i=row; i>= 1 ; i--)  
{  
	for (j = i; j<row ; j++)   
{  
	System.out.print(" ");  
}     
	for (k = 1; k <= (2*i -1) ;k++)   
{  
	if( k==1 || i == row || k==(2*i-1))   
{  
	System.out.print("*");  
}  
	else   
{  
	System.out.print(" ");  
}  
}  
	System.out.println("");
		
	
}
}
}