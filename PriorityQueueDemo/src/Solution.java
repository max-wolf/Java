
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                        return e1.getValue() - e2.getValue();
                    }
                }
        );
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 2); map.put("bbb", 1); map.put("ccc", 3);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
