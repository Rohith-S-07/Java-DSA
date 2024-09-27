public class BinaryConseq1s {
    public static void main(String[] args) {
        int n =6;
        while(true){
            String binaryStr = Integer.toBinaryString(n);
            if(!binaryStr.contains("11")){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
