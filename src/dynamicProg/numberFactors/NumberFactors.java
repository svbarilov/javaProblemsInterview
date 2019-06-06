package dynamicProg.numberFactors;

public class NumberFactors {

    public int findFactors(int[] nums, int n) {
        // 1, 3, 4
        // way to get 1 - 1
        // ways to get 2 - 1
        // ways to get 3 - 2

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int dpZero = 1;
        int dpOne = 1;
        int dpTwo = 1;
        int dpThree = 2;
        int newNum = 0;
        for (int i = 4; i <= n; i++) {
            newNum = dpZero + dpOne +  + dpThree;
            dpZero = dpOne;
            dpOne = dpTwo;
            dpTwo = dpThree;
            dpThree = newNum;
        }
        return newNum;
    }

    public static void main(String[] args) {
        NumberFactors nf = new NumberFactors();
        int[] nums = {1, 3, 4};
        int n = 5;
        System.out.println(nf.findFactors(nums, n));
    }

}
