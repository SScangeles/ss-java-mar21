package com.ss.wk1.d1.guessrng;
/**
 * Week 1, Day 1 - Java Basic: Guess that random number!
 * @author Christian Angeles
 */
public class GuessRng {
	private ConsoleUserInput userIn;
	private RandomNumber rng;
	private ParseNumInput parseNum;
	private boolean winState;
	private Integer numChance, userNum;
	
	public GuessRng() {
		userIn = new ConsoleUserInput();
		rng = new RandomNumber();
		parseNum = new ParseNumInput();
		winState = false;
		numChance = 0;
	}
	
	public void start() {
		while(numChance < 5 && !winState) {
			System.out.print("Enter a number (1-100): ");
			userIn.setInput();
			userNum = parseNum.getIntegers(userIn.getInput())[0];
			numChance += 1;
			
			if(userNum != null) {
				winState = GuessRngUtil.checkNum(userNum, rng.getPosRandNumber(100));
			}
			
			if(winState) {
				System.out.println("You win!");
				break;
			}
			else if(numChance < 5){
				System.out.printf("Try again.\n\n");
			}
			else {
				System.out.println("You lose!");
			}
		}
	}
}
