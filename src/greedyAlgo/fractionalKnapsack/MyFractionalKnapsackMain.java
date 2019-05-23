package greedyAlgo.fractionalKnapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyFractionalKnapsackMain {

    public static void main(String[] args) {
        final int MAX_CAPACITY = 65;
        // create knapsack and items
        MyFractionalKnapsack bag = new MyFractionalKnapsack(MAX_CAPACITY);
        MyFractionalKnapsack.MyFractionalKnapsackItem item1 = new MyFractionalKnapsack.MyFractionalKnapsackItem(20, 100);
        MyFractionalKnapsack.MyFractionalKnapsackItem item2 = new  MyFractionalKnapsack.MyFractionalKnapsackItem(30, 120);
        MyFractionalKnapsack.MyFractionalKnapsackItem item3 = new  MyFractionalKnapsack.MyFractionalKnapsackItem(10, 60);
        MyFractionalKnapsack.MyFractionalKnapsackItem item4 = new  MyFractionalKnapsack.MyFractionalKnapsackItem(25, 50);

        // add all items to Array
        ArrayList<MyFractionalKnapsack.MyFractionalKnapsackItem> allItems = new ArrayList<>();
        allItems.add(item1);
        allItems.add(item2);
        allItems.add(item3);
        allItems.add(item4);

        // implement comparator interface so we could sort items by density and sort them
        Comparator<MyFractionalKnapsack.MyFractionalKnapsackItem> comparator = new Comparator<MyFractionalKnapsack.MyFractionalKnapsackItem>() {
            @Override
            public int compare(MyFractionalKnapsack.MyFractionalKnapsackItem o1, MyFractionalKnapsack.MyFractionalKnapsackItem o2) {
                return o1.itemWeight/o1.value - o2.itemWeight/o2.value;
            }
        };
        Collections.sort(allItems, comparator);

        // add items to bag
        for (MyFractionalKnapsack.MyFractionalKnapsackItem item : allItems) {
            if (bag.spaceRemaining() == 0) {
                System.out.println("Maximum capacity reached now");
                break;
            } else if (bag.spaceRemaining() >= item.itemWeight) {
                bag.addItem(item);
                System.out.println("Added " + item.itemWeight + " kg with value " + item.value);
            } else if (bag.spaceRemaining() < item.itemWeight) {
                MyFractionalKnapsack.MyFractionalKnapsackItem fracItem = item.getFraction(bag.spaceRemaining(), item);
                bag.addItem(fracItem);
                System.out.println("Added partial item with " + fracItem.itemWeight + " kg with value " + fracItem.value + " of available " + item.value);
            }
        }
        System.out.println("Finished adding items to bag");
    }
}
