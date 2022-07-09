import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char arr[] = new char[a];
        int count = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = s.next().charAt(0);
        }
        for (int i = 0; i < a; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                System.out.print(arr[i]+" ");
            }
        }
        for (int i = 0; i < a; i++)
        {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
