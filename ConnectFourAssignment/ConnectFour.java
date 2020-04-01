//Kate Hickey
//2032000H

import java.util.Random;

public class ConnectFour {
	
    public static void main(String[] args) {

    // testing
    	Player p1 = new Player("Clive",'x');
    	Counter c = new Counter(p1);
    	System.out.println(c.getPlayer().toString() + ", " + c.toString());
    			
    // testing
    	Column col = new Column(4);
    	for(int i=0;i<5;i++) {
    		Boolean result = col.add(new Counter(p1));
    		System.out.println(result);
    		}	
    			
    //testing
    	Column col2 = new Column(6);
    	Player p2 = new Player("Sharon",'o');
    	for(int i=0;i<3;i++) {
    		col2.add(new Counter(p1));
    		col2.add(new Counter(p2));
    	}
    	col2.display();		
    	
    //testing
    	Board board = new Board(6,7);
    	board.add(new Counter(p2),6);
    	board.add(new Counter(p1),3);
    	board.add(new Counter(p2),4);
    	board.add(new Counter(p1),4);
    	board.add(new Counter(p2),5);
    	board.add(new Counter(p1),5);
    	board.add(new Counter(p2),6);
    	board.add(new Counter(p1),5);
    	board.add(new Counter(p2),6);
    	board.add(new Counter(p1),6);	
    	System.out.print("\n"+board.toString() + "\n");
    			
    //calling the static method for a random game
    	playGame(new Board(6,8), p1, p2);
    }
    
    
    private static void playGame(Board board, Player p1, Player p2) {
    	
    	//creating a Random object
		Random r = new Random();
	
		int columnNum;
		
		//start with player 1
		Player playerTurn = p1;
		
		/*
		 * while the board isn't full, assign a random integer to the column number 
		 * (bound by the number of columns on the board). i.e. choose a random column
		 */
		while (!board.isFull()) {
			columnNum = r.nextInt(board.getColumns());
		
			//if the randomly chosen column is full, choose another random column number
			if(board.getBoard()[columnNum].isFull()) {
				columnNum = r.nextInt(board.getColumns());
			}
			
			//adds counter of the player whose turn it is to the random column number chosen
			board.add(new Counter(playerTurn), columnNum);
			
			//changes player turn
			if (playerTurn.equals(p1)){
				playerTurn = p2;
				
				//prints board
				System.out.print("\n" + board.toString());
			}else{
				playerTurn = p1;
				
		//prints board after other players turn
		System.out.print("\n" + board.toString());
			}
		}
		
		//prints final board
		System.out.print("\n Final board \n" + board.toString());
	}
} 
/*
 * I was't sure if you wanted each move printed or just the final board. If you didn't want each move 
 * I would just take out lines 80 and 85, "system.out.print("\n" + board.toString());"
 */


