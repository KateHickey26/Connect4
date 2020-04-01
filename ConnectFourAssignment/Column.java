//Kate Hickey
//2032000H

public class Column {
	
	private int numRows;
	private int i;
	
	/*
	 * creating array, (represents a column of the board) with a length the 
	 * same as the number of rows.
	 */
	private Counter []column = new Counter[numRows]; 

	//constructor
	Column(int numRows) {
		this.numRows = numRows;
		this.column = new Counter[numRows];
		this.i = numRows - 1; // i is the bottom of the column.
	}
	
	/*
	 * if position 0 in array (top of column) doesn't contain 'null' i.e. isn't empty, 
	 * then the column is full, returns true. Otherwise returns false.
	 */
	boolean isFull() {
		if(column[0]!= null){
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * if isFull() method returns false, i.e column is not full, the counter is added 
	 * to the column array, at index i. i is numRows-1 (i.e. bottom of the column). 
	 * "i--" moves up the column.
	 */
	boolean add(Counter c) {
		if(!isFull()) {
			column[i] = c;
				i--;	
			return true;
		}else {
			return false;
		}	
	}
	
	/*
	 * Gives us the contents of a space on the board. Returns blank if, at the index on the 
	 * column array of the given row number, there is null/nothing. 
	 * Otherwise, returns the counter symbol of the player in that space.
	 */
	public String displayRow(int row) {
		if(column[row] == null) {
			return " ";
		}else {
			return "" + column[row].getPlayer().getCounterSymbol();
		}
	}
	
	/*
	 * prints the output from displayRow() method (either a space or a counter symbol) up to the 
	 * length of the column array i.e. for the number of rows e.g. column[6] has 6 rows.
	 */
	public void display() {
		for (int j=0; j<column.length; j++) {
			System.out.println(displayRow(j));
		}	
	}
}
