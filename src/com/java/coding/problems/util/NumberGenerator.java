package com.java.coding.problems.util;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    public static List<Integer> generateNumbers() {
        List<Integer> numberList = new ArrayList<>();
        for(int i=1; i <= 3; i++) {
            numberList.add(i);
        }
        return numberList;
    }

}
