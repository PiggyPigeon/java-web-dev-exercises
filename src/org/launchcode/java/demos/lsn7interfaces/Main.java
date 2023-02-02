package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
//        Comparator comparator = new FlavorComparator();
        System.out.println("Before sort:" + flavors.toString());
//        flavors.sort(comparator);
        //below line combines the above two commented out lines
        flavors.sort(new FlavorComparator());
        System.out.println("After sort: " + flavors.toString());

        System.out.println("Before sort: " + cones.toString());
        cones.sort(new ConeComparator());
        System.out.println("After sort: " + cones.toString());

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
