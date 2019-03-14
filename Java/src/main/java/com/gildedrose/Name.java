package com.gildedrose;

class Name {

    private final String value;

    Name(String name) {
        if(name == null) {
            throw new RuntimeException("name cannot be null");
        }
        this.value = name;
    }

    String getValue() {
        return value;
    }
}
