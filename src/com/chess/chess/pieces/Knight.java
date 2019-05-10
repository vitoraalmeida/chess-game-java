package com.chess.chess.pieces;

import com.boardgame.Board;
import com.boardgame.Position;
import com.chess.ChessPiece;
import com.chess.Color;

public class Knight extends ChessPiece {


    public Knight(Board board, Color color) {
        super(board, color);
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().getPiece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getRows()];

        Position p = new Position(0,0);


        p.setValues(position.getRow() - 1, position.getColumn() -2 );
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }


        p.setValues(position.getRow()  -2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }


        p.setValues(position.getRow() - 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }


        p.setValues(position.getRow() - 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow() + 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }


        p.setValues(position.getRow() +  2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }


        p.setValues(position.getRow() + 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }


        p.setValues(position.getRow() + 1, position.getColumn() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        return mat;

    }

    @Override
    public String toString(){
        return "N";
    }

}