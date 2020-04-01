package game;

public class Application {

	public static void main(String[] args) {
		Game game = new Game();
		LevelState level1= new Level1(game);
		game.setLevelState(level1);
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();

	}

}
