//Kate Hickey
//2032000H

public class Board {
	
	private int rows;
	private int columns;
	private Column[] board; 

	//getter
	int getColumns() {
		return columns;
	}
	
	//getter for array
	Column[] getBoard() {
		return board;
	}

	//constructor
	Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		//creating array
		this.board = new Column[columns];
		
		/*
		 * while x is less than the number of columns, a new Column object is created at index x 
		 * on the board array. "x++" moves along the array. This creates a column for every row.
		 */
		for(int x = 0; x<columns; x++) {
			board[x]= new Column(rows);	
		}
	}
	
	/*
	 * If the column is full, no action taken and returns false. Otherwise, the counter 
	 * is added to the column, at the board[] array, where the column number is the index.
	 */
	boolean add(Counter counter, int columnNum) {
		if(board[columnNum].isFull()) { 
			return false;
		}else {
			board[columnNum].add(counter);
			return true;
		}
	}
	
		
	public String toString() {
		
		/*
		 * Adds top line of board. Prints lines | | putting i in the box, to number each column.
		 * Stops when i<columns, not i<=columns because the first column is 0 not 1
		 */
		String output = "|"; 
		for(int i=0;i<columns;i++) {
			String line = i + "|";
			output += line;
		}
		
		//Takes a new line. Adds the line of dashes, as may times as there are columns.
		output += "\n";
		for(int i=0;i<columns;i++) {
			output += "--";                
		}
		
		/*
		 * Takes a new line. Prints lines | | with the output from the displayRow() 
		 * method at j (row number) at index of i (column number) on the board[] array
		 */
		output += "\n";
		for(int j=0; j<rows; j++) {
			output += "|"; // adds line at front of every row
			for(int i=0; i<columns; i++) {
				output += board[i].displayRow(j) + "|";
			}
			output += "\n";
		}
	        return output;
	}
		
	
	
	/*
	 * uses isFull() method from column class. Checks each index of board[] array, i.e each column.
	 * Count starts at 0, adds 1 every time a column is full. if the total number of full columns equals the 
	 * length of the board array (i.e. the total number of columns), the board is full.
	 */
	boolean isFull() {
		int count =0;
		for(int i = 0; i<board.length; i++) {
			if(board[i].isFull()) {
			count++;
			}
		}
		if(count == board.length) {
			return true;
		}else {
			return false;
		}
	}
}

