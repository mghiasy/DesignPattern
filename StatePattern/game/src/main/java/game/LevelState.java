package game;

public abstract class LevelState {
    protected LevelState(Game game) {
        this.game = game;
    }

    public abstract  String getLevel();
    public abstract  int addpoint(int newPoints);
    protected int totalPoints;
    protected final Game game;
}
