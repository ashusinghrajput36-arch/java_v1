package q_on_array2;

import java.util.HashMap;

//elements with highest and lowest frequency
public class q5 {
    static int[] gethighestandlowest(int arr[]){
        HashMap<Integer,Integer> freq=new HashMap<>();
        for (int num:arr){

            freq.put(num, freq.getOrDefault(num,0)+1);
        } int highestfreq=Integer.MIN_VALUE;
        int highestnum=-1;
        for (int key:freq.keySet()){
            int currentkey=key;
            int currentfreq=freq.get(key);
            if (currentfreq>highestfreq){
                highestfreq=currentfreq;
                highestnum=currentkey;
            }
        }
        int lowestfreq=Integer.MAX_VALUE;
        int lowestnum=-1;
        for (int key:freq.keySet()){
            int currentkey=key;
            int currentfreq=freq.get(key);
            if (currentfreq<lowestfreq){
                lowestfreq=currentfreq;
                lowestnum=currentkey;
            }
        }
        int ans[]={highestnum,lowestnum};
        return ans;

    }

    public static void main(String[] args) {
        int arr[]={1,1,1,3,2,2,6,6,6,6,6,9,9};
        int ans[]=gethighestandlowest(arr);
        System.out.println("the highest frequency num: "+ans[0]);
        System.out.println("the lowest frequency num: "+ans[1]);
    }
}
