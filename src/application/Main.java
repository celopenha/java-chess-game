package application;

import application.view.UI;
import board.Board;
import board.Piece;
import chess.ChessMatch;

public class Main {
	public static void main(String args[]) {
		
		Board board = new Board(8,8);

		ChessMatch chessMatch = new ChessMatch();


		UI.printBoard(chessMatch.getPieces());

		Piece piece = board.piece(1, 1);

		System.out.println(piece);
	}
}
