package Strings;

public class changeCase {
    public static void main(String[] args) {
        String str = "Hi, Welcome To Java Course";
        char[] s = str.toCharArray();
        System.out.println(str);
        //without using ASCII values
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                char ch = (char) (s[i] - 'A' + 'a');
                s[i] = ch;
            }
        }
//        Using ASCII values
//        for (int i = 0; i < s.length; i++) {
//            if (s[i] >= 'A' && s[i] <= 'Z') {
//                s[i] = (char) (s[i] + 32);
//            }
//        }
        for (char ch : s) {
            System.out.print(ch);
        }

    }
}
