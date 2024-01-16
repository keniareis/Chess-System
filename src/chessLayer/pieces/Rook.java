package chessLayer.pieces;

import boardLayer.Board;
import chessLayer.ChessPiece;
import chessLayer.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
