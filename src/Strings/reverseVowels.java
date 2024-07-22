package Strings;

public class reverseVowels {
    public static void main(String[] args) {
        String str = "Hi, welcome to Java course";
        char[] s = str.toCharArray();
        System.out.println(str);
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            while (!isVowel(s[i])) {
                i++;

            }
            while (!isVowel(s[j])) {
                j--;
            }

            if (i < j) {
                char ch = s[i];
                s[i] = s[j];
                s[j] = ch;
                i++;
                j--;
            }
        }
        for (char ch : s) {
            System.out.print(ch);
        }

    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
