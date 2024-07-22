package Strings;

public class reverseWordsInString {
    public static void main(String[] args) {
        String string = " This is the String  to   Reverse";

        String[] words = string.trim().split("\\s+");

        int left =0, right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left]= words[right];
            words[right] = temp;
            left++;
            right--;
        }
        System.out.println(String.join(" ",words));
    }
}
