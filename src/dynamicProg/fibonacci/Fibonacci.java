package dynamicProg.fibonacci;

public class Fibonacci {

    public int fibonacci_BottomUp(int num) {
        if (num < 2) {
            return num;
        }
        int beforeLast = 0;
        int last = 1;
        for (int i = 2; i<= num; i++) {
            int temp = last;
            last = last + beforeLast;
            beforeLast = temp;
        }
        return last;
    }

//

    public int fibonacci_Recursive_TopDown(int[] memo, int num) {
        if (num < 2) {
            return num;
        }
        if (memo[num] == 0) {
            memo[num] = fibonacci_Recursive_TopDown(memo, num - 1) + fibonacci_Recursive_TopDown(memo, num - 2);
        }
        return memo[num];
    }



    public static void main(String[] args) {
        int num = 12;
        Fibonacci fb = new Fibonacci();
//        System.out.println(fb.fibonacci_BottomUp(num));
        int[] memo = new int[num + 1];
        System.out.println(fb.fibonacci_Recursive_TopDown(memo, num));

        // 0 1 1 2 3 5 8 13 21 34 55 89 144
        // 0 1 2 3 4 5 6 7  8  9  10 11 12

    }
}
