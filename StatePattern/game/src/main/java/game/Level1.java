package game;

public class Level1 implements LevelState{

    @Override
    public String getLevel() {
        return "Level 1";
    }

    @Override
    public int computePoints(Game game,int newPoints) {
       int totalPoints = game.getTotalPoints() + newPoints;
        if (totalPoints > 10) { // move to level 2
          //  LevelState level2 = new Level2();
            game.setLevelState(new Level2());
            //game.setTotalPoints(totalPoints + 1);//add 1 bonus point
            totalPoints=totalPoints + 1;
        }
        return  totalPoints;
    }

}
