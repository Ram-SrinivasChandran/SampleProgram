import java.util.*;
class Virtusa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = a.length();
        int c = 0,d=0,e=0,f=0;
        if (b >= 8) {
            for (int i = 0; i < b; i++) {
                String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
                char ch = a.charAt(i);
                if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                    c++;
                }
                else if(a.charAt(i) >='a' && a.charAt(i)<='z')
                {
                    d++;
                }
                else if(a.charAt(i)>='0'&&a.charAt(i)<='9')
                {
                    e++;
                }
                else if(specialCharactersString.contains(Character.toString(ch))){
                    f++;
                }

            }
            if(c>=1 && d>=1 && e>=1 && f>=1)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Not Valid");
            }
        }
        else
        {
            System.out.println("Not Valid");
        }
    }
}
