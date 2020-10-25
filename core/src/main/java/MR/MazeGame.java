package MR;

public class MazeGame extends BaseGame {

	@Override
	public void create() {

		super.create();
		setScreen(new LevelScreen());
	}
}