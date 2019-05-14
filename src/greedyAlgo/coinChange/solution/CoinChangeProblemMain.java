package greedyAlgo.coinChange.solution;
import java.util.Arrays;

public class CoinChangeProblemMain {

	public static void main(String[] args) {
		int [] coins = {1, 5, 10, 50, 100, 500,2000};
		int amount = 7;
		System.out.println("Coins available: "+Arrays.toString(coins));
		System.out.println("Target amount: "+ amount);
		CoinChangeProblem.coinChangeProblem(coins, amount);
	}//end of method

}//end of class
