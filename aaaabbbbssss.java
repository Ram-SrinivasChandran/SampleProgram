import java.util.*;
class Virtusa{
    public static void main(String[]args)
    {
        Scanner a=new Scanner(System.in);
        String s = a.nextLine();
        String modified = "";
        int len = s.length();
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < len; i++) {
            count = 1;
            for (int j = i + 1; j < len; j++) {
                if (c[i] == ' ') {
                    break;
                }
                if (c[i] == c[j]) {
                    count++;
                    c[j] = ' ';
                }

            }
            if (c[i] != ' ') {
                modified += c[i] + "" +  count;

            }
        }
        System.out.println(modified);

    }
}
