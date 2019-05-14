package greedyAlgo.coinChange.my;

public class CoinChanger {

    int[] pool;

    public CoinChanger(int[] pool) {
        this.pool = pool;
    }

    public void giveChange(int target) {

        int coinCount;
        for (int i = this.pool.length - 1; i >= 0; i--) {
            if (target == 0) {
                break;
            } else if (this.pool[i] <= target) {
                coinCount = target/this.pool[i];
                System.out.println("Give " + coinCount + " coins of value " + this.pool[i]);
                target -= this.pool[i];
                continue;
            }
        }
        if (target > 0) {
            System.out.println("Sorry, don't have small enough change to give you " + target + " dollars");
        }
    }



} // end of class
