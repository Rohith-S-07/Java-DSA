package AccenturePractice;

public class Prime1toN {
    public static void main(String[] args) {
        int n =10;
        for (int i=0; i<n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i =2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
