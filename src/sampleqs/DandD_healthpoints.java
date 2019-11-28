package sampleqs;

import java.util.ArrayList;
import java.util.List;

public class DandD_healthpoints {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(-5);
		arr.add(-3);
		arr.add(-2);
		arr.add(2);
		arr.add(10);
		arr.add(-15);
		arr.add(1);
		System.out.println(getHighestMinus(arr));

	}
	
	public static long minHealth(List<Integer> dungeon) {
		long highestMinus = getHighestMinus(dungeon);
    
        highestMinus = Math.abs(highestMinus) + 1;
        
        // boolean isPassed = isPassingDungeons(dungeon, highestMinus);
        while(!isPassingDungeons(dungeon, highestMinus)) {
            highestMinus++;
        }
        return highestMinus;
    }
	
	private static long getHighestMinus(List<Integer> dungeon) {
    	long highestMinus = 0;
    	long health =0;
    	for(int i = 0; i < dungeon.size(); i++) {
            health += dungeon.get(i);
            if(health <= 0 && health < highestMinus) {
            	highestMinus= health;
            }
        
    	}
    	return highestMinus; 
    	
    }

    public static long minHealthOld(List<Integer> dungeon) {
    // Write your code here
        long highestMinus = 0;
        for(int i = 0; i < dungeon.size(); i++) {
            if(dungeon.get(i) < 0){
                if(highestMinus > dungeon.get(i))
                    highestMinus = dungeon.get(i);
            }
        }

        
        highestMinus = Math.abs(highestMinus) + 1;
        // boolean isPassed = isPassingDungeons(dungeon, highestMinus);
        while(!isPassingDungeons(dungeon, highestMinus)) {
            highestMinus++;
        }
        return highestMinus;
    }

    private static boolean isPassingDungeons(List<Integer> dungeon, long health){
        boolean isPassing = false;

        for(int i = 0; i < dungeon.size(); i++) {
            health += dungeon.get(i);
            if(health > 0)
                isPassing = true;
            else {
                isPassing = false;
                break;
            }
        }
        return isPassing;
    }
    
}
