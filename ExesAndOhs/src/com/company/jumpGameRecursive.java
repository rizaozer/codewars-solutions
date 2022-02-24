//package com.company;
//
//import java.util.ArrayList;
//import java.lang.Math;
//
//public class jumpGameRecursive {
//    private static final ArrayList<Integer> test2 = new ArrayList<>();
//    private static final ArrayList<Integer> unLocked = new ArrayList<>();
//
//    public static void main(String[] args) {
//        ArrayList<Integer> test1 = new ArrayList<>();
//        test1.add(200);
//        test1.add(100);
//        test1.add(950);
//
//        unLocked.add(100);
//
//        System.out.println("JumpTo= " + jumpTo(0, 0, 500, test1));
//        System.out.println(test2);
//    }
//
//    private static int calculateSum(int index, int[] array) {
//        int sum = 0;
//
//        for (int i = index; i < array.length; i++) {
//            sum += Math.abs(array[i]);
//        }
//        return sum;
//    }
//
//    //counter
//    public static int jumpTo(int index, int counter, int points, ArrayList<Integer> array) {
//        // If it's the final step, stop, and push the counter to the array
//        // If points are enough to finish all the steps, jump next
//
//        // If cant go forward, jump back
//        // else jump forward, jump back
//
////        System.out.println(index + " " + counter + " " + points);
//
//        if (index == array.size() - 1) {
//            test2.add(counter);
//            return counter;
//        }
//
////        int pointsToFinish = calculateSum(index, array);
//        System.out.println(unLocked);
//        System.out.println("index at the begining= " + index);
//        System.out.println("points at the begining= " + points);
//        System.out.println("next points= " + array.get(index + 1));
//        int myNextPoints = 0;
//        if (points >= array.get(index + 1)) {
//                if (unLocked.contains(array.get(index + 1))  && unLocked.size() > index + 1 &&
//                array.get(index + 1).equals(unLocked.get(index + 1))) {
//                    myNextPoints = points + array.get(index + 1);
//                    System.out.println("RUN1");
//                } else {
//                    System.out.println("RUN2");
//                    myNextPoints = points - array.get(index + 1);
//                    unLocked.add(array.get(index + 1));
//                }
//                System.out.println("points= " + myNextPoints);
//                System.out.println("counter= " + counter);
//                System.out.println("Index= " + index);
//                System.out.println();
//                return jumpTo(++index, ++counter, myNextPoints, array);
//        } else if (points < array.get(index + 1)) {
//            System.out.println("points < array[index + 1]");
//            System.out.println();
//            int myBackwardsPoints = points + array.get(index - 1);
//            return jumpTo(--index, ++counter, myBackwardsPoints, array);
//        } else {
//            if (index >= 0) {
//                int myBackwardsPoints = points + array.get(index - 1);
//                return jumpTo(--index, ++counter, myBackwardsPoints, array);
//            }
//            int myForwardPoints = points + array.get(index + 1);
//            return jumpTo(++index, ++counter, myForwardPoints, array);
//        }
//    }
//}
