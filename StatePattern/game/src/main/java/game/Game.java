package game;

import java.util.Random;

//this class is independent from level so if we add another level no need to be changed
public class Game {
	private int totalPoints = 0;
	//private int level = 1;
	//Relation with LevelState Class
	private LevelState levelState;

	public void play() {
		Random random = new Random();
		int currentPoints=random.nextInt(7);
		addPoints(currentPoints);
		System.out.println("CurrentPoint = "+currentPoints+ "totalPoints="+totalPoints+" level="+levelState.getLevel());
	}

	public void setLevelState(LevelState levelState) {
		this.levelState = levelState;
	}

	//for bonus
	public int getTotalPoints() {
		return totalPoints;
	}

	public int addPoints(int newPoints) {
//		if (level == 1) {
//			totalPoints = totalPoints + newPoints;
//			if (totalPoints > 10) { // move to level 2
//				level = 2;
//				totalPoints = totalPoints + 1;//add 1 bonus point
//			}
//		} else if (level == 2) {
//			totalPoints = totalPoints + 2 * newPoints;
//			if (totalPoints > 20) { // move to level 3
//				level = 3;
//				totalPoints = totalPoints + 2; //add 2 bonus points
//			}
//		} else if (level == 3) {
//			totalPoints = totalPoints + 3 * newPoints;
//		}
//
//		return totalPoints;


		//for bonus
		//No need to call setTotalPoint from states
		//totalPoints=totalPoints+levelState.computePoints(this,newPoints);
		totalPoints=levelState.computePoints(this,newPoints);
		return totalPoints;
	}
}
