package q_on_array2;

import java.util.HashMap;

//find the first repeating element
public class q9 {
    public int firstrepeating(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i : arr) {
            if(freq.get(i) > 1) {
                return i;
            }
            }return -1;
        }
    }