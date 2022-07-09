import java.util.*;
class Virtusa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }
        int e=s.nextInt();
        for(int j=0;j<e;j++) {
            int b = s.nextInt();
            int c = s.nextInt();
            int max = 0, d = 0;
            if (b > c) {
                d = b;
                b = c;
                c = d;
            }
            for (int i = b; i <= c; i++) {
                if (arr[i] > max) {
                    max = arr[i];

                }
            }
            System.out.println(max);
        }
    }
}
