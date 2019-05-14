package greedyAlgo.coinChange.my;

public class CoinChangeMain {

    public static void main(String[] args) {

        int[] pool = {2, 5, 10, 20, 50, 100, 500, 1000};

        CoinChanger coinChanger = new CoinChanger(pool);
        coinChanger.giveChange(123);
    }

} //end of class
