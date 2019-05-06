package com.chess.chess.pieces;

import com.boardgame.Board;
import com.chess.ChessPiece;
import com.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color){
        super(board, color);

    }

    @Override
    public String toString(){
        return "K";
    }
}
