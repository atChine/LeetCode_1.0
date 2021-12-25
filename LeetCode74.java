/**
 * @ClassName: LeetCode74
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/25 9:09
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix==null){
            return false;
        }
        int row = matrix.length;
        int col=matrix[0].length;
        int left=0;
        int right=row*col-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            int temp = matrix[mid/col][mid%col];
            if(temp==target){
                return true;
            }if(temp>target){
                right=mid-1;
            }if(temp<target){
                left=mid+1;
            }
        }
        return false;
    }
}
