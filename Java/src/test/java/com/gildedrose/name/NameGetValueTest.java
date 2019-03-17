package com.gildedrose.name;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameGetValueTest {

    @Test
    public void returnsValue() {
        String value = "name";

        assertThat(new Name(value).getValue()).isEqualTo(value);
    }

}