package _692;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author lining
 * @date 18-11-20
 */
public class Solution2 {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<>(n,
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        int freq = o1.getValue() - o2.getValue();
                        return freq == 0 ? -o1.getKey().compareTo(o2.getKey()) : freq;
                    }
                });

        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (i < k) {
                q.offer(entry);
                i++;
            } else {
                if (entry.getValue() > q.peek().getValue()) {
                    q.poll();
                    q.offer(entry);
                } else if (entry.getValue() == q.peek().getValue()) {
                    if (entry.getKey().compareTo(q.peek().getKey()) < 0) {
                        q.poll();
                        q.offer(entry);
                    }
                }
            }
        }

        LinkedList<String> ret = new LinkedList<>();
        while (!q.isEmpty()) {
            ret.addFirst(q.poll().getKey());
        }

        return ret;
    }
}
