package q_on_array2;

import java.util.HashMap;

public class q4 {
    static int getmode(int arr[]){
        HashMap<Integer, Integer> freq=new HashMap<>();
        for (int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int maxfreq=-1;
        int maxfreqwalikey=-1;

        for(int key: freq.keySet()){
            int cureentKey=key;
            int currentkeyfreq=freq.get(key);
            if (currentkeyfreq>maxfreq){
                maxfreq=currentkeyfreq;
                maxfreqwalikey=cureentKey;
            }
        }return maxfreqwalikey;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,3,5,5,5,5,6,8,7,9};
        int ans=getmode(arr);
        System.out.println(ans);}
}
