package chess;

import board.Board;
import board.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

  private Board board;
  
  private int turn;

  public ChessMatch(){
    board = new Board(8,8);
    initialSetup();
  }

  public ChessPiece[][] getPieces(){


    ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];

    for(int i = 0; i < board.getRows(); i++){
      for(int j = 0; j < board.getColumns(); j++){
        matriz[i][j] = (ChessPiece) board.piece(i, j);
      }
    }
    return matriz; // retorna matriz c peças no tabuleiro de xadrez...
  }
  private void initialSetup(){
    board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
    board.placePiece(new King(board, Color.WHITE), new Position(2, 2));
  }
}
