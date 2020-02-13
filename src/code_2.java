import java.util.HashMap;

public class code_2 {
    public static void main(String[] args){
        int[][] matrix = {{}};
        int target = 5;
        System.out.println(findNumberIn2DArray(matrix,target));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target){
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int i = 0,j = matrix[0].length-1;
        while (i >=0 && j>=0&&i<matrix.length&&j<matrix[0].length){
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
