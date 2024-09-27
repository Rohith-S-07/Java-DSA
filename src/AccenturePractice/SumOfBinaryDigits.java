package AccenturePractice;

public class SumOfBinaryDigits {
    public static void main(String[] args) {
        int n =10;
        StringBuilder binaryStr = new StringBuilder();

        if(n ==0){
            System.out.println(0);
            System.exit(0);
        }
        int sum =0;

        while(n>0){
            int remainder = n%2;
            binaryStr.append(remainder);
            sum+=remainder;
            n=n/2;
        }
        System.out.println(binaryStr.reverse());
        System.out.println(sum);
    }
}
