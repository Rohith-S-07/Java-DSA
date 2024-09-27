package AccenturePractice;

public class MaxPair {
    public static void main(String[] args) {
        int[] arr  = {7,9,11,12,6,8};
        int[] result = findMaxpair(arr);
        if(result.length==0){
            System.out.println("Not found");
        }
        else {
            System.out.println("Found " + result[0] + " " + result[1]);
        }
    }

    public static int[] findMaxpair(int[] arr){
        boolean found = false;
        int max = Integer.MIN_VALUE;
        int[] pair = new int[2];
        for(int i =0; i<arr.length;i++){
            for(int j =i+1; j<arr.length; j++){
                int first = arr[i];
                int second = arr[j];

                if(first+second==18 && first>second){
                    int product = first*second;
                    if(product>max){
                        pair[0]=first;
                        pair[1]=second;
                        max=product;
                        found=true;
                    }
                }
            }
        }
        if(!found)
            return new int[0];
        return pair;
    }
}
