package Strings;

public class removeVowels {
    public static void main(String[] args) {
        String str = "Hi, welcome to Java course";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                continue;
            System.out.print(ch);
        }

    }
}
