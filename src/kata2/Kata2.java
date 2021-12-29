package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 4, 1, 1, 16, 21, 32, 4, 10, 7, 47};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int key : data) {
           histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        } 
    }
}