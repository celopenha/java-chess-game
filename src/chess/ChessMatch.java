package chess;

import board.Board;

public class ChessMatch {

  private Board board;
  
  private int turn;

  public ChessMatch(){
    board = new Board(8,8);
  }

  public ChessPiece[][] getPieces(){

    ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];

    for(int i = 0; i < board.getRows(); i++){
      for(int j = 0; j < board.getColumns(); j++){
        matriz[i][j] = (ChessPiece) board.getPieceByBoardPosition(i, j);
      }
    }

    return matriz; // retorna matriz c peças no tabuleiro de xadrez...
  }
}
