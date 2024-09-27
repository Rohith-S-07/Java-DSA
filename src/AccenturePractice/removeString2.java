package AccenturePractice;
public class removeString2 {
    public static void main(String[] args) {
        String str1 = "AABBCC";
        String str2 = "AB";
        System.out.println(ClearString(str1,str2));
    }
    public static String ClearString(String input1, String input2){
        for(int i = 0; i<input2.length(); i++){
            input1 = input1.replaceAll(String.valueOf(input2.charAt(i)), "");
        }
        return input1;
    }
}
