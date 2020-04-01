package game;

public class Level3 extends LevelState{
    public Level3(Game game)  {
        super(game);
    }

    @Override
    public String getLevel() {
        return "Level 3";
    }

    @Override
    public int addpoint(int newPoints) {
        totalPoints = totalPoints + 3*newPoints;
        return totalPoints;
    }

}
