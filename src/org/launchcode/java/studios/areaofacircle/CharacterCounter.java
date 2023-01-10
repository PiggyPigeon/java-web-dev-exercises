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
//        String inputStripped = input.matches("[^a-zA-Z_0-9]");
        String inputStripped = input.replaceAll("[^a-z]", "");


//    HashMap<Character, Integer> characterCount = new HashMap<>();
//        String testString = "Pokemon, Gotta catch em all";
//        char[] charactersInString = testString.toCharArray();
//
//        for (char character : charactersInString) {
//            if (characterCount.containsKey(character)){
//                characterCount.put(character, characterCount.get(character) + 1);
//            }
//            else {
//                characterCount.put(character, 1);
//            }
//        }

//        String testString = "If the product of two terms is zero then " +
//                "common sense says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics into a form that " +
//                "can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s " +
//                "pretty straightforward from there.";

// create a Map to store the character counts. Below
        var charCounts = new HashMap<Character, Integer>();
//         split string into char array and iterate through with a for loop
        for (char i : inputStripped.toCharArray()) {
//             If the character is not in the hashMap we made above, add it with a count of 1
            if (!charCounts.containsKey(i)) {
                charCounts.put(i, 1);
            }
//             If the character is already in the map, increment its count
            else {
                charCounts.put(i, charCounts.get(i) + 1);
            }
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

