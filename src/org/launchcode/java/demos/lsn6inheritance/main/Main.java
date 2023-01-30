package org.launchcode.java.demos.lsn6inheritance.main;

public class Main {

    public static void main(String[] args) {
        HouseCat marmalade = new HouseCat("Marmalade", 8);
        marmalade.eat();
        System.out.println(marmalade.isTired());
        System.out.println(marmalade.noise());
    }
}
