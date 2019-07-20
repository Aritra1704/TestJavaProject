package sampleqs;

import java.util.ArrayList;

public class FindLost {

	static int x = 0, y = 0;
	static int myX = 0, myY = 0;
	static int direction = 0;//{0,1,2,3}
	static int myDirection = 0;//{0,1,2,3,4,5,6,7}
	
	public static void main(String[] args) {
		String path = "MMLM";
		
		ArrayList<String> arrPath = new ArrayList<String>();
		for(int i = 0; i < path.length(); i++) {
			arrPath.add(path.charAt(i) + "");
		}

		
		for(int i = 0; i < arrPath.size(); i++) {
			if(arrPath.get(i).equalsIgnoreCase("M")) {
				movePerson();
			} else if(arrPath.get(i).equalsIgnoreCase("L")) {
				if(direction == 0)
					direction = 3;
				else
					direction--;
			} else if(arrPath.get(i).equalsIgnoreCase("R")) {
				if(direction == 3)
					direction = 0;
				else
					direction++;
			}
		}
		
		System.out.println("X: " + x + ", Y: " + y);
	}
	
	static void movePerson() {
		switch(direction) {
			case 0://north
				y++;
				break;
			case 1://east
				x++;
				break;
			case 2://south
				y--;
				break;
			case 3://west
				x--;
				break;
		}
	}

	enum DIRECTION {
			NORTH,
			EAST,
			SOUTH,
			WEST
			
	}
}
