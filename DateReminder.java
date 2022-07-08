import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int sum=0;
            for(int j=1;j<=b;j++)
            {
                if(j == 1 || j==2|| j == 3|| j==4 || j == 5 || j==6|| j == 7 || j == 8 || j == 10|| j==11 || j == 12)
                {
                    if(a<=31)
                    {
                        if(c%4==0 && c%100!=0 || c%400==0)
                        {
                            for(int i=1;i<=b;i++) {
                                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                    sum+=31;
                                }
                                else if(i == 4 || i==6 || i==9 || i==11)
                                {
                                    sum+=30;
                                }
                                else
                                {
                                    sum+=29;
                                }
                            }
                            sum+=a;
                            System.out.println(sum);
                        }
                        else
                        {
                            for(int i=1;i<b;i++) {
                                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                                    sum+=31;
                                }
                                else if(i == 4 || i==6 || i==9 || i==11)
                                {
                                    sum+=30;
                                }
                                else
                                {
                                    sum+=28;
                                }
                            }

                            sum+=a;
                            System.out.println(sum);
                            break;
                        }

                    }
                    else
                    {
                        System.out.println("Invalid Date");
                    }

            }

        }
    }
}
