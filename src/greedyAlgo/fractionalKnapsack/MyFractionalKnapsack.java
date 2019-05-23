package greedyAlgo.fractionalKnapsack;

public class MyFractionalKnapsack {

    public static class MyFractionalKnapsackItem {
        public int itemWeight;
        public int value;

        public MyFractionalKnapsackItem(int weight, int value) {
            this.itemWeight = weight;
            this.value = value;
        }

        public MyFractionalKnapsackItem getFraction(int weight, MyFractionalKnapsackItem item) {
            int value = item.value/item.itemWeight * weight;
            return new MyFractionalKnapsackItem(weight, value);
        }
    }

    public int maxCapacity;
    public int knapsackWeight;
    public int value;

    public MyFractionalKnapsack(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addItem(MyFractionalKnapsackItem item) {
        if (this.knapsackWeight + item.itemWeight > this.maxCapacity) {
            throw new IllegalStateException("Can;t add item, exceeds Maximum Knapsack Capacity");
        } else {
            this.value += item.value;
            this.knapsackWeight += item.itemWeight;
        }
    }

    public int spaceRemaining() {
        return this.maxCapacity - this.knapsackWeight;
    }

}
