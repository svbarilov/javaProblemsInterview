package greedyAlgo.activitySelection.my;

import greedyAlgo.activitySelection.solution.Activity;

import java.util.ArrayList;

import static greedyAlgo.activitySelection.solution.ActivitySelectionMain.setupActivityList;

public class MyActivityMain {

    public static void main(String[] args) {
        ArrayList<Activity> activityList = setupActivityList();

        //Perform calculation on activities
        MyActivitySelection.activitySelection(activityList);
    }


}
