package com.boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] piece;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1){
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        piece = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece getPiece (int row, int column) {
        if (!positionExists(row,column)){
            throw new BoardException("Position not on the board");
        }
        return piece[row][column];
    }

    public Piece getPiece (Position position) {
        if (!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return piece[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position " + position);
        }
        this.piece[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return getPiece(position) != null;
    }
}
