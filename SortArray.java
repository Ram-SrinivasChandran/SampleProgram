import java.util.*;
class Main  
{  
public static void main(String[] args)   
{  
    Scanner s=new Scanner (System.in);
    int a=s.nextInt();
    int[] arr = new int[a];
    for(int i=0;i<a;i++)
    {
        arr[i]=s.nextInt();
    }
    for (int i = 0; i < a; i++)   
    {  
        for (int j = i + 1; j < a; j++)   
        {  
            int tmp = 0;  
            if (arr[i] > arr[j])   
            {  
                tmp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = tmp;  
            }  
        }  
    }
    for(int i=0;i<a;i++)
    {
    System.out.println(arr[i]);
    }
  }  
}  
