package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {


    @Override
    public int compare(Cone o1, Cone o2) {
        return o1.getCost() > o2.getCost()
                ?  1
                : (o1.getCost() == o2.getCost()) ? 0 : -1;
    }
}

//  public class FlavorComparator implements Comparator<Flavor> {
//
//    @Override
//    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
