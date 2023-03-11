package rocks.zipcodewilmington.tictactoe;


/**
 * @author leon on 6/22/18.
 */
public class Board {
    private static Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        return (horizontalCheck('X') || verticalCheck('X') || diagonalCheck('X'));
    }

    public Boolean isInFavorOfO() {
        return (horizontalCheck('O') || verticalCheck('O') || diagonalCheck('O'));
    }

    public Boolean isTie() {
        return ((!isInFavorOfO()) && (!isInFavorOfX()));
    }

    public String getWinner() {
        if (isInFavorOfO()) {
            return "O";
        } else if (isInFavorOfX()) {
            return "X";
        } else {
            return "";
        }
    }

    public boolean diagonalCheck(char play) {
        return ((play == matrix[0][0] && play == matrix[1][1] && play == matrix[2][2])
                || (play == matrix[0][2] && play == matrix[1][1] && play == matrix[2][0]));
    }

    public boolean horizontalCheck(char play) {
        return ((play == matrix[0][0] && play == matrix[0][1] && play == matrix[0][2])
                || (play == matrix[1][0] && play == matrix[1][1] && play == matrix[1][2])
                || (play == matrix[2][0] && play == matrix[2][1] && play == matrix[2][2]));
    }

    public boolean verticalCheck(char play) {
        return ((play == matrix[0][0] && play == matrix[1][0] && play == matrix[2][0])
                || (play == matrix[0][1] && play == matrix[1][1] && play == matrix[2][1])
                || (play == matrix[0][2] && play == matrix[1][2] && play == matrix[2][2]));
    }
}