package higherLevelProblems;

public class SnakesAndLaddersTest{
	
	public static void assertTrue(boolean temp) {
		if(temp) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case failed");
		}
	}
	
	public static void assertTrue(int check,int result) {
		
		if(check==result) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case failed");
		}
	}
	
	public static void main(String[] args) {
		
//		 @Test
		//check for Dice
		 SnakesAndLadders sl=new SnakesAndLadders();
		 int points=sl.throwDice();
		 assertTrue(points >= 1 && points <= 6);
		 
		 // check for Ladders
		 assertTrue(33,sl.checkLadders(7));
		 
		 //check fro Snakes
		 assertTrue(19,sl.checkSnakes(36));
		 
		 
		 
		
	}
}