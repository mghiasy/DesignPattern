package game;

public class Level2 extends LevelState{
    public Level2(Game game)  {
        super(game);
    }

    @Override
    public String getLevel() {
        return "Level 2";
    }

    @Override
    public int addpoint(int newPoints) {
        totalPoints = game.getTotalPoints() + 2 * newPoints;
        if (totalPoints > 20) { // move to level 3
            LevelState level3 = new Level3(game);
            game.setLevelState(level3);
            game.setTotalPoints(totalPoints + 1);//add 1 bonus point
        }
        return  totalPoints;
    }

}
