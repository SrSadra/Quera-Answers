import java.util.Scanner;

public class JenasGhalb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String matn = in.nextLine();
        matn = matn.toLowerCase().replaceAll(" ", "");
        matn = removechar(matn);
        if ((matn.length() == 0) || (IsPalindrome(matn, 0, matn.length() - 1) == 1)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static int IsPalindrome(String tmp , int i , int g){
        if (tmp.charAt(i) != tmp.charAt(g)){
            return -1;
        }
        else if (i == g || (i + 1 == g)){
            return 1;
        }
        else {
            return IsPalindrome(tmp, i + 1, g - 1);
        }
    }

    public static String removechar(String tmp){
        String res = "";
        for (int i = 0 ; i < tmp.length() ; i++){
            if ((tmp.charAt(i) == '?') || (tmp.charAt(i) == '.') || (tmp.charAt(i) == ':') || (tmp.charAt(i) == ',') || (tmp.charAt(i) == '!')){
                continue;
            }
            else {
                res += tmp.charAt(i);
            }
        }
        return res;
    }
}
