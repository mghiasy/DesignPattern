package game;

//for push methos it is better to use interface
public interface LevelState {

    //for push strustur we push the whole context class
    String getLevel();
    int computePoints(Game game, int newPoints);
    //  protected int totalPoints;
    //No need to it we want to use push method
    //protected final Game game;
}
