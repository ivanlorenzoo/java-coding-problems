package com.java.coding.problems.chapter2;

import com.java.coding.problems.helper.DummyHelper;
import com.java.coding.problems.util.DummyHelperGenerator;

/**
 * Chapter 2 no.46
 * equals() and hashCode():
 * Explain and exemplify how equals() and hashCode() methods work in Java.
 * note:
 * this static class only represent the usage example of equals and hashCode
 * the further explanation is at {@link com.java.coding.problems.helper.DummyHelper}
 */
public class ObjectEqualsAndHashCode {

    public static void checkObject(DummyHelper dummyHelper) {
        DummyHelper similarObject = DummyHelperGenerator.generateDummyHelper();
        System.out.println("The Object: " + dummyHelper.hashCode());
        System.out.println("Similar Object: " + similarObject.hashCode());
        System.out.println("Is Equal?" + dummyHelper.equals(similarObject));
    }
}
