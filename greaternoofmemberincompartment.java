    import java.util.*;
    class Virtusa {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String a = s.nextLine();
            int count=0;
            char c[]=a.toCharArray();
            int d=c.length;
            int b[]=new int[d];
            int j=0;
            for(int i=0;i<c.length;i++)
            {
                if(c[i]=='1')
                {
                    count++;
                }
                if(c[i]=='.')
                {
                    b[j]=count;
                    count=0;
                    j++;
                }
            }
            int max=0,compno=0;
            for(int i=0;i<5;i++)
            {
                if(b[i]>max)
                {
                    max=b[i];
                    compno=max;
                }
            }
            System.out.println(compno+1);
        }
    }
