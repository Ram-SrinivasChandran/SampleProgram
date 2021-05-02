public class FibonacciExample{
    public static void main (String[] args) {
        int i=0,a=1,b=1;
        System.out.print(a+" "+b);
        while(i<=100)
        {
            i=a+b;
            if(i>=100)
            {
                break;
            }
            System.out.print(" "+i);
            a=b;
            b=i;
            
        }
    }
}