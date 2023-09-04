package com.java.coding.problems.helper;

import java.util.Objects;

public class DummyHelper {

    private int id;
    private String name;

    public DummyHelper(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // overriding equals and hashCode implementation for object comp

    // equals in java have default implementation of comparing objects references
    // which mean two object with same class will only be equal if it has the same memory addresses
    // even if the value is the same
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DummyHelper that = (DummyHelper) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    // the representation of identity of an object
    // the hashCode will return other identity object if there are two similar object
    // should it be not overridden and return the Objects hash with the same content
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
