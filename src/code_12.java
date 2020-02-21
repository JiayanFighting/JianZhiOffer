import java.util.HashMap;

public class code_12 {
    public static void main(String[] args){
        char[][] board = {{'a','b'},{'c','d'}};
        String word = "abcd";
        System.out.println(exist(board,word));
    }

    public static boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0) return false;
        boolean[][] record = new boolean[board.length][board[0].length];
        for (int i = 0;i<board.length;i++){
            for (int j = 0 ;j<board[i].length;j++){
                boolean ret = helper(i,j,0,record,word,board);
                if (ret) return true;
            }
        }
        return false;
    }

    public static boolean helper(int x,int y,int index,boolean[][] record,String word,char[][] board){
        if (index == word.length()) return true;
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || record[x][y]) return false;
        if (board[x][y] != word.charAt(index)) return false;
        record[x][y] = true;
        //上
        boolean up = helper(x-1,y,index+1,record,word,board);
        //下
        boolean down = helper(x+1,y,index+1,record,word,board);
        //左
        boolean left = helper(x,y-1,index+1,record,word,board);
        //右
        boolean right = helper(x,y+1,index+1,record,word,board);
        record[x][y] = false;
        return up || down || left || right;
    }
}



