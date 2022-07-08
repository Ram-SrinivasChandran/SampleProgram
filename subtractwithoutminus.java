import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sub=a+~b+1;
        System.out.println(sub);
    }
}
