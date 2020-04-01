
//public class Winner {
//	
//	int col;
//	int row;
//	Column[] board;
//	
//	//constructor
//	Winner(int row, int col) {
//		this.row = row;
//		this.col = col;
//		this.board = new Column[col];
//
//	}
//	
//	
//	// Check for win horizontally
//	boolean horizontalWin(Column[] board) {
//	for (int row = 0; row < board.length; row++){
//	for (int col = 0; col < board[col].length - 3; col++){
//		if (board[col].equals("x") || board[col] == "o" && board[i] == board[i+1] && board[i] == board[i+2] && board[i] == board[i
//	+3]){
//	return true;
//	}
//	}
//	
//	
//	// Check for win vertically
//	boolean verticalWin(){
//	for (int col = 0; col < board[0].length; col++){
//	for (int row = 0; row < board.length - 3; row++){
//	if (board[row][col] != '□' && board[row][col] == board[row+1][col] &&
//	board[row][col] == board[row+2][col] && board[row][col] == board[row+3][col]){
//	return true;
//	}
//	}
//	}
//	
//	// Check for win diagonally, from top left
//	boolean diagonalLeftWin(){
//	for (int row = 0; row < board.length - 3; row++){
//	for (int col = 0; col < board[row].length - 3; col++){
//	if (board[row][col] != '□' && board[row][col] == board[row+1][col
//	+1] && board[row][col] == board[row+2][col+2] && board[row][col] ==
//	board[row+3][col+3]){
//	return true;
//	}
//	}
//	}
//	
//	// Check for win diagonally, from top right
//	boolean diagonalRightWin(){
//	for (int row = 0; row < board.length - 3; row++){
//	for (int col = 3; col < board[row].length; col++){
//	if (board[row][col] != '□' && board[row][col] == board[row+1]
//	[col-1] && board[row][col] == board[row+2][col-2] && board[row]
//	[col] == board[row+3][col-3]){
//	return true;
//	}
//	}
//	}
//	return result;
//	}
//	
//	
//
//}
