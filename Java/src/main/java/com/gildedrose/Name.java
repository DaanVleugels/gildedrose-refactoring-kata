package com.gildedrose;

public class Name {

    private final String value;

    public Name(String name) {
        if(name == null) {
            throw new RuntimeException("name cannot be null");
        }
        this.value = name;
    }

    public String getValue() {
        return value;
    }
}
