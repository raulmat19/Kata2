package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 4, 1, 1, 16, 21, 32, 4, 10, 7, 47};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
                
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}