package higherLevelProblems;

import java.util.Scanner;

public class SnakesAndLaddersRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SnakesAndLadders sl = new SnakesAndLadders();

		int currentPosition = 0;

		System.out.println("game get Started.........");
		while (currentPosition < sl.getBoardSize()) {

			System.out.println("please Press -> Enter");
			sc.nextLine();
			int dise = sl.throwDice();
			System.out.println("dise OutPut:" + dise);
			currentPosition = currentPosition + dise;

			if (currentPosition > sl.getBoardSize()) {
				System.out.println("....You overshot the board,throw Dice again....");
				currentPosition = currentPosition - dise;
			} else if (currentPosition == sl.getBoardSize()) {
				System.out.println("***Congratulations on winning the game! ***");
				break;
			} else if (currentPosition < sl.getBoardSize()) {

				if (currentPosition != sl.checkSnakes(currentPosition)) {
					System.out.println("####Snake bite####");
				}
				currentPosition = sl.checkSnakes(currentPosition);

				if (currentPosition != sl.checkLadders(currentPosition)) {
					System.out.println("####Ladders Up####");
				}
				currentPosition = sl.checkLadders(currentPosition);

			}
			System.out.println("current Position: " + currentPosition);
		}

		System.out.println(".........game Over...........");
		sc.close();

	}
}
