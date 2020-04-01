package game;

public class Level1 extends LevelState{
    public Level1(Game game) {
        super(game);
    }

    @Override
    public String getLevel() {
        return "Level 1";
    }

    @Override
    public int addpoint(int newPoints) {
        totalPoints = game.getTotalPoints() + newPoints;
        if (totalPoints > 10) { // move to level 2
            LevelState level2 = new Level2(game);
            game.setLevelState(level2);
            game.setTotalPoints(totalPoints + 1);//add 1 bonus point
        }
        return  totalPoints;
    }

}
