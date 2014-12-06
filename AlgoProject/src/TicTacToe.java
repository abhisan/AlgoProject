public class TicTacToe {
	enum Piece {
		Empty, Red, Blue
	};
	enum Check {
		Row, Column, Diagonal, ReverseDiagonal
	}
	Piece getIthColor(Piece[][] board, int index, int var, Check check) {
		if(check == Check.Row){
			return board[index][var];
		}
		else if(check == Check.Column){
			return board[var][index];
		}
		else if(check == Check.Diagonal){
			return board[var][var];
		}
		else
		{
			return board[board.length-1-var][var];
		}
	}
	Piece getWinner(Piece[][] board, int index, Check check) {
		Piece winner = getIthColor(board, index, 0, check); 
		if(winner==Piece.Empty)
			return Piece.Empty;
		else
		{
			for (int i = 1 ;i<board.length; i++){
				if(winner != getIthColor(board, index, i, check))
					return Piece.Empty;
			}
		}
		return winner;
	}
	
	Piece hasWon(Piece[][] board) {
		Piece winner;
		for(int i = 0; i<board.length;i++){
			winner = getWinner(board, i, Check.Row);
			if(winner!=Piece.Empty)
				return winner;
			winner = getWinner(board, i, Check.Column);
			if(winner!=Piece.Empty)
				return winner;
		}
		winner = getWinner(board, -1, Check.Diagonal);
		if(winner==Piece.Empty)
			return winner;
		winner = getWinner(board, -1, Check.ReverseDiagonal);
		if(winner==Piece.Empty)
			return winner;
		return Piece.Empty;
	}
	
	public static void main(String s[]){
		TicTacToe ttt = new TicTacToe();
		Piece board [][] = new Piece[3][3];
		board[0][0] = Piece.Red; 
		board[0][1] = Piece.Red;
		board[0][2] = Piece.Blue;
	
		board[1][0] = Piece.Empty; 
		board[1][1] = Piece.Empty;
		board[1][2] = Piece.Blue;
		
		board[2][0] = Piece.Empty; 
		board[2][1] = Piece.Empty;
		board[2][2] = Piece.Blue;
		for(int i = board.length-1; i>=0 ; i--){
			for(int j = 0 ; j<board.length; j++){
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.print(ttt.hasWon(board));
	}
}
