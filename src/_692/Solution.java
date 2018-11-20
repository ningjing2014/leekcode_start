package _692;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author lining
 * @date 18-11-20
 */
public class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        List<String> array = new ArrayList<>();

        if (words == null || words.length < k) {
            for (String word : words) {
                array.add(word);
            }
            return array;
        }

        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                Integer count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue(
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        if (o1.getValue().equals(o2.getValue())) {
                            return o1.getKey().compareTo(o2.getKey());
                        }
                        return o2.getValue() - o1.getValue();
                    }
                });
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            priorityQueue.add(entry);
        }

        int i = 0;
        while (!priorityQueue.isEmpty()) {
            if (i < k) {
                array.add(priorityQueue.poll().getKey());
                i++;
            } else {
                break;
            }
        }

        return array;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.topKFrequent(new String[] { "i", "love", "leetcode", "i", "love", "coding" }, 2);
        System.out.println(list);
    }

}