//Abstraction to handle the properties of each tile of the game

public class Piece {
	private int number;
	private boolean square; //square boolean identifies whether the square has been clicked by the user 
	private boolean bomb; //bomb boolean identifies whether there is a bomb
	private int xcoord;
	private int ycoord;
	private boolean check;

	public Piece(int x, int y){
		xcoord = x;
		ycoord = y;
		square = false; 
		number = 0;
		bomb = false;
		check = false;
	}

	public Piece(int x, int y, int num){
		xcoord = x;
		ycoord = y;
		square = false;
		number = num;
		if (num == -1) 
			bomb = true;
		else 
			bomb = false;
		check = false;
	}

	public Piece(int x, int y, int num, boolean z){
		xcoord = x;
		ycoord = y;
		square = false;
		number = num;
		bomb = z;
		check = false;
	}
	public boolean getCheck(){
		return check;
	}

	public void setCheck(boolean a){
		check = a;
	}


	public int getNumber(){
		return number;
	}

	public void setNumber(int num){
		number = num;
	}

	public boolean getBomb(){
		return bomb;
	}

	public void setBomb(boolean x){
		bomb = x;
	}
	
	public boolean getSquare(){
		return square;
	}
	
	public void setSquare(boolean x){
		square = x;
	}
}
