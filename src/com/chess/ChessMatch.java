package com.chess;

import com.boardgame.Board;
import com.boardgame.Position;
import com.chess.chess.pieces.King;
import com.chess.chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch (){
        board = new Board(8, 8);
        initialSetup();
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

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.WHITE), new Position(0,4));
        board.placePiece(new King(board, Color.WHITE), new Position(7,4));
    }
}
