package com.company;

import java.util.ArrayList;

public class jumpGameRecursiveClean {
    private static final ArrayList<Integer> unLocked = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(100);
        test1.add(200);
        test1.add(400);
        test1.add(900);
        test1.add(100);

        unLocked.add(100);

        System.out.println("JumpTo= " + findNextPlatform(0, 0, 500, test1));
    }

    public static int findNextPlatform(int index, int counter, int points, ArrayList<Integer> array) {

        if (index == array.size() - 1) {
            return counter;
        }

        int myNextPoints = 0;
        if (points >= array.get(index + 1)) {
            if (unLocked.contains(array.get(index + 1))  &&
                    unLocked.size() > index + 1 &&
                    array.get(index + 1).equals(unLocked.get(index + 1))) {
                myNextPoints = points + array.get(index + 1);
            } else {
                myNextPoints = points - array.get(index + 1);
                unLocked.add(array.get(index + 1));
            }
            return findNextPlatform(++index, ++counter, myNextPoints, array);
        }
        else if (points < array.get(index + 1)) {
            return jumpBack(index, counter, points, array);
        }
        else {
            if (index >= 0) {
                return jumpBack(index, counter, points, array);
            }
            int myForwardPoints = points + array.get(index + 1);
            return findNextPlatform(++index, ++counter, myForwardPoints, array);
        }
    }


    private static int jumpBack(int index, int counter, int points, ArrayList<Integer> array) {
        int myBackwardsPoints = points + array.get(index - 1);
        return findNextPlatform(--index, ++counter, myBackwardsPoints, array);
    }
}
