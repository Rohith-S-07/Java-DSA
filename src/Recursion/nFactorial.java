package Recursion;
import java.util.Scanner;
public class nFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nFact(n));
    }
    public static int nFact(int N){
        if(N==0)
            return 1;
        int nmin1fact = nFact(N-1);
        return N+nmin1fact;
    }
}
