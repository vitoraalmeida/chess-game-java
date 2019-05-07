package com.chess;

import com.boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialLVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }


}
