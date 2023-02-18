public class Sudoku {
    static int board[][] = {
        {3,1,0,0,7,0,0,0,0}
    ,{6,0,0,1,9,5,0,0,0}
    ,{0,9,8,0,0,0,0,6,0},
    {8,0,0,0,6,0,0,0,3},
    {4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},
    {0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},
    {0,0,0,0,8,0,0,7,9}};

    static void print()
    {
        for(int i = 0 ; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean canValid(int row,int col,int value)
    {
        //row checking
        for(int i=row;i<board.length;i++)
        {
            if(board[row][i]==value)
            {
                return false;
            }
        }
        //column checking
        for(int i=col;i<board.length;i++)
        {
            if(board[i][col]==value)
            {
                return false;
            }
        }
        //row checking
        int startrow=row-row%3;
        int startcol=col-col%3;
        for(int i=startrow;i<startrow+3;i++)
        {
            for(int j=startcol;j<startcol+3;j++)
            {
                if(board[i][j]==value)
                {
                    return false;
                }
            }

        }
        return true;
            
    }

    static boolean solver(int row,int col)
    {
        //base cases
        if(col==board.length)
        {
            col=0;
            row=row+1;
        }
        if(row==board.length)
        {
            print();
            return true;
        }
        if(board[row][col]!=0)
        {
            return solver(row,col+1);
        }
        //Logic
        for(int value=1;value<=9;value++)
        {
            if(canValid(row,col,value))
            {
                board[row][col]=value;
                boolean result=solver(row,col+1);
                if(result)
                {
                    return true;
                }
                //Backtracking
                board[row][col]=0;
            }
        }
        return false;

    }
    

    public static void main(String[] args) {
        System.out.println(solver(0, 0));
        
    }
    
}
