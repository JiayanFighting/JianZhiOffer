import java.util.HashMap;

public class _code_01 {


    public boolean Find(int target, int [][] array) {
        int i=0,j=array[0].length-1;
        while(i>=0&&j>=0&&i<array.length&&j<array[0].length){
            if(array[i][j]==target){
                return true;
            }
            else if(array[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }

        return false;


    }
}
