/* If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we? Our goal is to create a function that will check that for us!

Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:

[[0, 0, 1],
 [0, 1, 2],
 [2, 1, 0]]
We want our function to return:

-1 if the board is not yet finished AND no one has won yet (there are empty spots),
1 if "X" won,
2 if "O" won,
0 if it's a cat's game (i.e. a draw).
You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe. */
public class Tictactoechecker {
    public int isSolved(int[][] board) {
        int val = 0;
        boolean winner = false;
        int i = 0;
        int j = 0;
        if ((board[i][i] == board[i + 1][i + 1]) && (board[i + 1][i + 1] == board[i + 2][i + 2])) {
            if (board[i][i] == 0 ){
                val = -1 ;
            }
            else{
                val = board[i][i];
                winner = true;
            }
        }
        if ((board[i][i + 2] == board[i + 1][i + 1]) && (board[i + 1][i + 1] == board[i + 2][i])) {
            if(board[i][i + 2] == 0 ){
                val = -1 ;
            }
            else{
                val = board[i][i + 2];
                winner = true;
            }
        }
        if ((val != -1) && (winner == false)){
            while (i <= 2) {
                if ((board[j][i] == board[j + 1][i]) && (board[j + 1][i] == board[j + 2][i])) {
                    if (board[j][i] != 0){
                        val = board[j][i];
                        winner = true;
                        break;
                    }
                }
                if ((board[i][j] == board[i][j + 1]) && (board[i][j + 1] == board[i][j + 2])) {
                    if (board[i][j] != 0){
                        val = board[i][j];
                        winner = true;
                        break;
                    }
                }
                i++;
            }
        }
        if (winner == false ){
            j=0;
            for (i = 0 ; i<= 2; i++){
                if ((board[i][j] == 0) || (board[i][j+1] == 0) || (board[i][j+2] == 0)){
                    val =-1 ;
                    break;
                }
            }
        }
        return val ;
    }
    public void test(){
        int[][] tab = {
                {2, 1, 1},
                {0, 1, 1},
                {2, 2, 2}
        };
        int result = isSolved(tab);
        System.out.println("the int is : "+ result);
    }
}
