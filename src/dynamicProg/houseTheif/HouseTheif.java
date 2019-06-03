package dynamicProg.houseTheif;

public class HouseTheif {

    public int bottomUp(int[] nums) {
        int last = 0;
        int beforeLast = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = last;
            last = Math.max(nums[i] + beforeLast, last);
            beforeLast = temp;
        }
        return last;
    }

    public static void main(String[] args) {
        HouseTheif hs = new HouseTheif();
        int[] wealth = {5, 7, 1, 30, 8, 2, 4};
        System.out.println(hs.bottomUp(wealth));
    }
}
