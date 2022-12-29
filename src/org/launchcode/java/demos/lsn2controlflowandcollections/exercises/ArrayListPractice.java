package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> tenNumList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            tenNumList.add(i);
            //could add a Math.random to make this better
        }
        int total = sumEven(tenNumList);
        System.out.println(total);
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> greenEggsWords = new ArrayList<String>(Arrays.asList(greenEggs.replace(".", "").replace(",", "").split(" ")));
        System.out.println(findWordsOfCertainLength(greenEggsWords));
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> findWordsOfCertainLength(ArrayList<String> array) {
        ArrayList<String> newArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int searchNum = input.nextInt();
        for (String word : array) {
            if (word.length() == searchNum) {
                newArray.add(word);
            }
        }
        System.out.println("These words have only " + searchNum + " characters: " + newArray);
        return newArray;
    }

}


//    public static ArrayList<String> findWordsOfCertainLength(ArrayList<String> array) {
//        ArrayList<String> newArray = new ArrayList<>();
//        for (String word : array) {
//            if (word.length() == 5) {
//                newArray.add(word);
//            }
//        }
//        System.out.println("These words have 5 only characters " + newArray);
//        return newArray;
//    }

//   public static ArrayList<String> findWordsOfCertainLength(ArrayList<String> array) {
//      ArrayList<String> newArray = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a word length: ");
//        int searchNum = input.nextInt();
//        for (String word : args) {
//        if (word.length() == searchNum) {
//        newArray.add(word);
//        }
//        }
//        System.out.println("These words have only " + searchNum + " characters: " + newArray);
// }

