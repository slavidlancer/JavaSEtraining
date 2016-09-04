package com.jse.hackerrank.games.tictactoe;

//game: array with indexes
//array storage
//-------------
//| 0 | 1 | 2 |
//-------------
//| 3 | 4 | 5 |
//-------------
//| 6 | 7 | 8 |
//-------------
//
//shown to the user
//-------------
//| 1 | 2 | 3 |
//-------------
//| 4 | 5 | 6 |
//-------------
//| 7 | 8 | 9 |
//-------------

//UI
//initial
//-------------
//| - | - | - |
//-------------
//| - | - | - |
//-------------
//| - | - | - |
//-------------
//
//gameplay
//-------------
//| O | - | O |
//-------------
//| - | X | - |
//-------------
//| - | - | X |
//-------------


public class TicTacToe {
    protected char[] board;
    protected char userMarker; //X
    protected char aiMarker; //O
    protected char winner;
    protected char currentMarker;
    
    public TicTacToe(char userMarker, char aiMarker) {
        this.userMarker = userMarker;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = userMarker;
    }
    
    private static char[] setBoard() {
        char[] newBoard = new char[9];
        
        for (int i = 0; i < newBoard.length; i++) {
            newBoard[i] = '-';
        }
        
        return newBoard;
    }
    
    public boolean playTurn(int spot) {
        boolean isValid = isWithinRange(spot) && !isSpotTaken(spot);
        
        if (isValid) {
            this.board[spot - 1] = this.currentMarker;
            
            this.currentMarker = (this.currentMarker == this.userMarker) ?
                    this.aiMarker : this.userMarker;
        }
        
        return isValid;
    }
    
    private boolean isSpotTaken(int spot) {
        boolean isTaken = (this.board[spot - 1] != '-');
        
        return isTaken;
    }
    
    private boolean isWithinRange(int number) {
        boolean isInsideRange = ((number > 0) &&
                (number < (this.board.length + 1)));
        
        return isInsideRange;
    }
    
    public void printBoard() {
        System.out.println();
        System.out.println(" -------------");
        
        for (int i = 0; i < this.board.length; i++) {
            if ((i == 3) || (i == 6)) { //((i % 3 == 0) && (i != 0))
                System.out.println();
                System.out.println(" -------------");
            }
            
            System.out.print(" | " + this.board[i]);
            
            if ((i == 2) || (i == 5) || (i == 8)) {
                System.out.print(" |");
            }
        }
        
        System.out.println();
        System.out.println(" -------------");
        System.out.println();
    }
    
    public static void printIndexBoard() {
        System.out.println();
        System.out.println(" -------------");
        
        for (int i = 0; i < 9; i++) {
            if ((i == 3) || (i == 6)) { //((i % 3 == 0) && (i != 0))
                System.out.println();
                System.out.println(" -------------");
            }
            
            System.out.print(" | " + (i + 1));
            
            if ((i == 2) || (i == 5) || (i == 8)) {
                System.out.print(" |");
            }
        }
        
        System.out.println();
        System.out.println(" -------------");
        System.out.println();
    }
    
    private boolean isThereAWinner() {
        boolean isDiagonalOrMiddleRowWinning = ((isLeftDiagonalWinning() ||
                isRightDiagonalWinning() || isMiddleRowWinning() ||
                isSecondColumnWinning()) && (this.board[4] != '-'));
        boolean isTopRowOrFirstColumnWinning = ((isTopRowWinning() ||
                isFirstColumnWinning()) && (this.board[0] != '-'));
        boolean isBottomRowOrThirdColumnWinning = ((isBottomRowWinning() ||
                isThirdColumnWinning()) && (this.board[8] != '-'));
        
        if (isDiagonalOrMiddleRowWinning) {
            this.winner = this.board[4];
        } else if (isTopRowOrFirstColumnWinning) {
            this.winner = this.board[0];
        } else if (isBottomRowOrThirdColumnWinning) {
            this.winner = this.board[8];
        }
        
        boolean isWinning = (isDiagonalOrMiddleRowWinning ||
                isTopRowOrFirstColumnWinning ||
                isBottomRowOrThirdColumnWinning);
        
        return isWinning;
    }
    
    private boolean isTopRowWinning() {
        boolean isWinning = ((board[0] == board[1]) &&
                ((board[1] == board[2])));
        
        return isWinning;
    }
    
    private boolean isMiddleRowWinning() {
        boolean isWinning = ((board[3] == board[4]) &&
                ((board[4] == board[5])));
        
        return isWinning;
    }
    
    private boolean isBottomRowWinning() {
        boolean isWinning = ((board[6] == board[7]) &&
                ((board[7] == board[8])));
        
        return isWinning;
    }
    
    private boolean isFirstColumnWinning() {
        boolean isWinning = ((board[0] == board[3]) &&
                ((board[3] == board[6])));
        
        return isWinning;
    }
    
    private boolean isSecondColumnWinning() {
        boolean isWinning = ((board[1] == board[4]) &&
                ((board[4] == board[7])));
        
        return isWinning;
    }
    
    private boolean isThirdColumnWinning() {
        boolean isWinning = ((board[2] == board[5]) &&
                ((board[5] == board[8])));
        
        return isWinning;
    }
    
    private boolean isLeftDiagonalWinning() {
        boolean isWinning = ((board[2] == board[4]) &&
                ((board[4] == board[6])));
        
        return isWinning;
    }
    
    private boolean isRightDiagonalWinning() {
        boolean isWinning = ((board[0] == board[4]) &&
                ((board[4] == board[8])));
        
        return isWinning;
    }
    
    private boolean isTheBoardFilled() {
        for (int i = 0; i < this.board.length; i++) {
            if (this.board[i] == '-') {
                return false;
            }
        }
        
        return true;
    }
    
    public String gameOver() {
        boolean winnerPresent = isThereAWinner();
        
        if (winnerPresent) {
            return "winner: " + this.winner;
        } else if (isTheBoardFilled()) {
            return "draw";
        } else {
            return "not over";
        }
    }
}
