import java.util.*;
class Study
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String day=s.next();
        int a=s.nextInt();
        int count=0,c=0;
        String [] b={"mon","tue","wed","thu","fri","sat","sun"};
        for(int i=1;i<=a;i++) {
            if (a >= 7) {
                for (int j = 0; j < b.length; j++) {
                    if (day == b[6]) {
                        count++;
                    } else {
                        c++;
                        if (c == 7) {
                            j = 0;
                            a = a - 7;
                            i = 0;
                            c = 0;

                        }
                    }
                    if (b[j] == "sun") {
                        count++;
                    }
                }
            }
            else
            {
                break;
            }
        }
        System.out.println(count);
    }
}
