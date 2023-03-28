package higherLevelProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakesAndLadders {

	private final int BOARD_SIZE = 100;

	private final int NUM_SNAKES_LADDERS = 3;

	@SuppressWarnings("serial")
	private final Map<Integer, Integer> snakes = new HashMap<Integer, Integer>() {
		{
			put(36, 19);
			put(65, 35);
			put(87, 32);
		}
	};

	@SuppressWarnings("serial")
	private final Map<Integer, Integer> ladders = new HashMap<Integer, Integer>() {
		{
			put(7, 33);
			put(37, 85);
			put(51, 72);
		}
	};

	public final int checkSnakes(int currentPosition) {

		if (snakes.containsKey(currentPosition)) {
			return snakes.get(currentPosition);
		}

		return currentPosition;
	}

	public final int checkLadders(int currentPosition) {

		if (ladders.containsKey(currentPosition)) {
			return ladders.get(currentPosition);
		}

		return currentPosition;
	}

	public final int throwDice() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

	public SnakesAndLadders() {
		super();
	}

	public int getBoardSize() {
		return BOARD_SIZE;
	}

	public int getNumSnakesLadders() {
		return NUM_SNAKES_LADDERS;
	}

	public Map<Integer, Integer> getSnakes() {
		return snakes;
	}

	public Map<Integer, Integer> getLadders() {
		return ladders;
	}

}
