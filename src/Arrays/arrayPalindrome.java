package Arrays;

public class arrayPalindrome {
    public static void main(String[] args) {
        int[] array = {1,2,4,3,4,2,1};
        System.out.println(isPalindrome(array));
    }
    public static String isPalindrome(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start] != arr[end]){
                return "Not a Palindrome";
            }
            start++;
            end--;
        }

        return "Is a Palindrome";
    }
}
