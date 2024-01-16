package boardLayer;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }
    protected Board getBoard() {
        return board;
    }

//    public boolean[][] possibleMoves(){
//    }
//
//    public boolean possibleMoves(Position position){
//
//    }
//
//    public boolean isThereAnyPossibleMove(){
//
//    }
}
