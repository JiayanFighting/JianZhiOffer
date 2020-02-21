import java.util.HashMap;

public class code_29 {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        spiralOrder(matrix);
    }

    public static int[] spiralOrder(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) return new int[0];
        int row = matrix.length , col = matrix[0].length,len = row*col;// row 行 col 列
        int[] ret = new int[len];
        int layer = 0;
        int index = 0;
        while (index < len){
            // 右
            for (int j = layer;j<col-layer;j++){
                ret[index] = matrix[layer][j];
                index++;
            }
            // 下
            for (int i = layer+1;i<row-layer;i++){
                ret[index] = matrix[i][col-1-layer];
                index++;
            }
            // 左
            for (int j = col-layer-1-1;j>=layer;j--){
                if (index < len){
                    ret[index] = matrix[row-1-layer][j];
                    index++;
                }
            }
            // 上
            for (int i = row-layer-1-1;i >= layer+1;i--){
                if (index < len){
                    ret[index] = matrix[i][layer];
                    index++;
                }
            }
            layer++;
        }
        return ret;
    }
}
