import java.util.HashSet;

/**
 * @ClassName: LeetCode705
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/22 21:24
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode705 {
    boolean[] hashset=null;
    public LeetCode705() {
            hashset= new boolean[1000001];
    }

    public void add(int key) {
        hashset[key]=true;
    }

    public void remove(int key) {
        hashset[key]=false;
    }
    public boolean contains(int key) {
        return hashset[key];
    }
}
