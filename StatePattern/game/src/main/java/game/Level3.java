package game;

public class Level3 implements LevelState{

    @Override
    public String getLevel() {
        return "Level 3";
    }

    @Override
    public int computePoints(Game game,int newPoints) {
        int totalPoints = game.getTotalPoints() + 3*newPoints;
        return totalPoints;
    }

}
