package sampleqs;

import java.util.List;

public class DandD_healthpoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static long minHealth(List<Integer> dungeon) {
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
