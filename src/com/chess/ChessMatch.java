package com.chess;

import com.boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch (){
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces (){
        ChessPiece[][] piecesMatrice = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                piecesMatrice[i][j] = (ChessPiece) board.getPiece(i, j);
            }
        }

        return piecesMatrice;
    }
}
