package HashMaps;

import java.util.HashMap;

public class MaxChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        String str = "aabbababcabcdbb";
        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);

            if(freqMap.containsKey(ch)){
                int freq = freqMap.get(ch);
                freqMap.put(ch, freq+1);
            }
            else {
                freqMap.put(ch,1);
            }
        }

        int maxval=0;
        char maxchar='a';

        for(char c : freqMap.keySet()){
            if(freqMap.get(c)>maxval){
                maxval= freqMap.get(c);
                maxchar=c;
            }
        }

        System.out.println(maxchar + " " + maxval);
    }
}
