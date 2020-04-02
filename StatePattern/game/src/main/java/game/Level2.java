package game;

public class Level2 implements LevelState{

    @Override
    public String getLevel() {
        return "Level 2";
    }

    @Override
    public int computePoints(Game game,int newPoints) {
        int totalPoints = game.getTotalPoints() + 2 * newPoints;
        if (totalPoints > 20) { // move to level 3
            game.setLevelState(new Level3());
           totalPoints=totalPoints + 2;
        }
        return  totalPoints;
    }

}
