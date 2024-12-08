public class digitProduct {
    public static void main(String[] args) {
        int N = 5244;
        int product = 1;
        while(N>0){
            int lastDigit = N%10;
            product*=lastDigit;
            N/=10;
        }
        System.out.println(product);
    }
}
