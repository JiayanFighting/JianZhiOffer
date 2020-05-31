public class _code_14 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        reOrderArray(array);
        for (int num:array){
            System.out.print(num+" ");
        }
    }

    // 稳定的
    public static void reOrderArray(int [] array) {
        for (int i = 0;i<array.length;i++){
            for (int j = 0; j<array.length-1;j++){
                if (array[j] % 2 == 0 && array[j+1] % 2 == 1){
                    swap(array,j,j+1);
                }
            }
        }

    }

    public static void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
