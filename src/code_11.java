import java.util.HashMap;

public class code_11 {
    public static void main(String[] args){
        int[] numbers = {3,3,1,3};
        System.out.println(minArray(numbers));
    }

    public static int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (numbers[mid] > numbers[right]) left = mid + 1;
            else if (numbers[mid] < numbers[right]) right = mid;
            else right = right - 1;
        }
        return numbers[left];
    }
}
