import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int count=0;
        char b[]={'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','a','b','c','d','e','f'};
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a.charAt(i)==b[j])
                {
                    count++;
                }
            }
        }
        if(count==a.length())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
