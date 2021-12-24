import java.util.*;

/**
 * @ClassName: LeetCode692
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/24 18:29
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode692 {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String word : words){
            if(!hashMap.containsKey(word)){
                hashMap.put(word,0);
            }
            int count = hashMap.get(word)+1;
            hashMap.put(word,count);
        }
        PriorityQueue<String> queue = new PriorityQueue<>(
        (w1,w2) -> hashMap.get(w1).equals(hashMap.get(w2)) ? w2.compareTo(w1) : hashMap.get(w1)-hashMap.get(w2)
        );
        for(String word : hashMap.keySet()) {
            queue.add(word);
            if (queue.size() > k) {
                queue.poll();
                }
            }
        ArrayList<String> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            res.add(queue.poll());
        }
        Collections.reverse(res);
        return res;
    }
}
