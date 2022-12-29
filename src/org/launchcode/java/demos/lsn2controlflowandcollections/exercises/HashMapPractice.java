package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> classRoster = new HashMap<Integer, String>();
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Enter your students (or ENTER to finish):");

        do{
            System.out.print("Student: ");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.print("ID: ");
                Integer IDNum = input.nextInt();
                classRoster.put(IDNum, name);

                input.nextLine();
            }
        } while (!name.equals(""));

        System.out.println("\nClass roster: " + classRoster);

    }
}




//    It takes in student names and ID numbers (as integers) instead of names and grades.
//
//        The keys should be the IDs and the values should be the names.
//
//        Modify the roster printing code accordingly.


//
//    ArrayList<Double> numbers = new ArrayList<>();
//    ArrayList<String> students = new ArrayList<>();
//    Scanner input = new Scanner(System.in);
//    Double newStudentID;
//
//        System.out.println("Enter your student ID (or ENTER to finish):");
//                // Get student IDs
//                do {
//                newStudentID = input.nextDouble();
//
//                if (!newStudentID.equals("")) {
//                numbers.add(newStudentID);
//                }
//
//                } while(!newStudentID.equals(""));
//
//                // Get student names
//                for (Double IDNum : numbers) {
//                System.out.print("Name of " + IDNum + ": ");
//                String name = input.nextLine();
//                students.add(name);
//                }
//                // Print class roster
//                System.out.println("\nClass roster:");
//
//                for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
//        System.out.println(student.getValue() + "'s ID: " + student.getKey());
//        }
//
//        System.out.println("Number of students in roster: " + classRoster.size());
//
//        }