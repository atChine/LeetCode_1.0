import java.util.Arrays;

/**
 * @ClassName: LeetCode881
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/24 19:21
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j= people.length-1;
        int count=0;
        while (i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}
