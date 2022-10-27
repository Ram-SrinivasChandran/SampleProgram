import java.util.*;
import java.lang.*;
public class Trainee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        String k[]=new String[h];
        List<Integer>m=new ArrayList<Integer>();
        for(int i=0;i<h;i++)
        {
            k[i]=s.next();
        }
        String c="";
        char d='\0';
        for(int i=0;i<h;i++) {
            String a=k[i];
            List<String> b = new ArrayList<String>();
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) >= '0' && a.charAt(j) <= '9') {
                    c += a.charAt(j);
                    if (j == a.length() - 1) {
                        b.add(c);
                        c = "";
                    }
                } else {
                    d = a.charAt(j);
                    b.add(c);
                    c = "";
                }
            }
            int e=1;
            int f=1;
            if(d=='*')
            {
                for(int l=0;l<b.size();l++)
                {
                    f*= Integer.parseInt(b.get(l));
                }
                m.add(f);
            }
            else if(d=='^')
            {
                for(int l=b.size()-1;l>=0;l--)
                {
                    int g=Integer.parseInt(b.get(l));
                    e= (int) Math.pow(g,e);
                }
                m.add(e);
            }
            b=null;
        }
        int arr[]=new int[m.size()];
        for(int i=0;i<m.size();i++)
        {
            arr[i]=m.get(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String Off=k[i];
                    k[i]=k[j];
                    k[j]=Off;
                }
            }
        }
        System.out.println("The sorted Array is:");
        for(int i=0;i<h;i++)
        {
            System.out.println(k[i]);
        }

    }
}
/*
Input/Output
4
2^2^2^2
30*4
4^2
36
The sorted Array is:
4^2
36
30*4
2^2^2^2
*/
