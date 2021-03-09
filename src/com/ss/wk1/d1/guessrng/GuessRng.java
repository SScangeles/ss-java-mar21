package com.ss.wk1.d1.guessrng;
/**
 * Week 1, Day 1 - Java Basic: Guess that random number!
 * @author Christian Angeles
 */
public class GuessRng {
	public static void main(String[] args) {
		UserInput user = new UserInput();
		RandomNumber rng = new RandomNumber();
		
		while(GuessRngUtil.getChances() < 5 && !GuessRngUtil.isWinner()) {
			user.askInput();
			GuessRngUtil.checkNum(user.getUserNum(), rng.getRandNumber());
			if(GuessRngUtil.isWinner()) {
				System.out.println("You win!");
				break;
			}
			else if(GuessRngUtil.getChances() < 5){
				System.out.println("Try again.");
			}
		}
		
		if(GuessRngUtil.getChances() >= 5) {
			System.out.println("You lose!");
		}
	}
}
