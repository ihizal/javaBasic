package com.deep.java.basics;

public class FutbollScorer {
	// Instance Variables - constitute the state of an object
	private int score;

	// Behavior - all the methods that are part of the class
	// An object of this type has behavior based on the
	// methods four, six and getScore
	public void four() {
		score = score + 4;
	}

	public void six() {
		score = score + 6;
	}

	public int getScore() {
		return score;
	}

	public static void main(String[] args) {
		FutbollScorer scorer = new FutbollScorer();
		scorer.six();
		// State of scorer is (score => 6)
		scorer.four();
		// State of scorer is (score => 10)
		System.out.println(scorer.getScore());
	}
}