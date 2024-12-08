public class BinaryConseq1s {
    public static void main(String[] args) {
        int n =6;
//        while(true){
//            String binaryStr = Integer.toBinaryString(n);
//            if(!binaryStr.contains("11")){
//                System.out.println(n);
//                break;
//            }
//            n++;
//        }

        String str = decimalToBinary(10);
        str = str.replaceAll("0","2");
        str = str.replaceAll("1","0");
        str = str.replaceAll("2","1");
        System.out.println(binarytodec(str));
    }

    public static String decimalToBinary(int n){
        if(n ==0)
            return "0";
        StringBuilder binary = new StringBuilder();
        while(n>=1){
            int remainder = n%2;
            binary.append(remainder);
            n = n/2;
        }

        return binary.reverse().toString();
    }

    public static int binarytodec(String s){
        int sum=0;
        int power=1;
        for(int i=s.length()-1;i>=0;i--){
            int num = s.charAt(i)-'0';
            sum+=power*num;
            power*=2;
        }
        return sum;
    }
}