public class code_66 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};

        for (int num:constructArr(a)){
            System.out.println(num);
        }
    }

    public static int[] constructArr(int[] a)  {
        int len = a.length;
        int[] ret = new int[len];
        int[] recordRight = new int[len+1];//0-len-1
        recordRight[len] = 1;
        for (int i = len -1;i>=0;i--){
            recordRight[i] = recordRight[i+1] * a[i];
        }
        int tmp = 1; // 记录左边的累乘
        for (int i =0;i<len;i++){
            ret[i] = tmp * recordRight[i+1];
            tmp = tmp *a[i];
        }
        return ret;
    }

    // 记录从左往右 和 从右往左的值
    public static int[] constructArr2(int[] a)  {
        int len = a.length;
        int[] ret = new int[len];
        int[] recordLeft = new int[len+1];// 1-len
        int[] recordRight = new int[len+1];//0-len-1
        recordLeft[0] = 1;
        recordRight[len] = 1;
        for (int i = 0;i<a.length;i++){
            recordLeft[i+1] = recordLeft[i] * a[i];
            int index = len -i-1;
            recordRight[index] = recordRight[index+1]*a[index];
        }
        for (int i =0;i<len;i++){
            ret[i] = recordLeft[i] * recordRight[i+1];
        }
        return ret;
    }
}
