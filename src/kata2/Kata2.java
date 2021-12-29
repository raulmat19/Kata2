package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1, 3, 5, 7, 9, 4, 1, 1, 16, 21, 32, 4, 10, 7, 47};
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        } 
    }
}