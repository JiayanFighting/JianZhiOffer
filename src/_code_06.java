import java.util.ArrayList;
import java.util.LinkedList;

public class _code_06 {
    public static void main(String[] args) {


    }

    public static int minNumberInRotateArray(int [] array) {
        int left = 0, right = array.length-1;
        int mid;
        while (left<=right){
            mid = (left + right) /2;
            if (array[mid] > array[right]){//在右边
                left = mid+1;
            }else if (array[mid] < array[right]){//在左边
                right = mid;
            }else {
                right--;
            }
        }
        return array[left];
    }
}
