package com.san4n.junit5.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNull;

class StringToDoubleConvertorWithValueSourceTest {

    private StringToDoubleConvertor stringToDoubleConvertor;

    @BeforeEach
    void beforeEachUnitTest() {
        stringToDoubleConvertor = new StringToDoubleConvertor();
    }


    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"", " "})
    void givenNullString_whenConvert_thenReturnNull(String value){
        Double actualValue = stringToDoubleConvertor.convert(value);

        assertNull(actualValue);
    }
}