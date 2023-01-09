package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CharacterCounter  {
    public static void main(String[] args) {
// have an input or test string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

//        String testString = "If the product of two terms is zero then " +
//                "common sense says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics into a form that " +
//                "can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s " +
//                "pretty straightforward from there.";

// create a Map to store the character counts. Below
        Map<Character, Integer> charCounts = new HashMap<>();
        // split string into char array and iterate through with a for loop
        for (char i : input.toCharArray()) {
            // If the character is not in the hashMap we made above, add it with a count of 1
            if (!charCounts.containsKey(i)) {
                charCounts.put(i, 1);
            }
            // If the character is already in the map, increment its count
            else {
                charCounts.put(i, charCounts.get(i) + 1);
            }
        }

        // Print the character counts
        //below also works if change Map to HashMap, why?
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

