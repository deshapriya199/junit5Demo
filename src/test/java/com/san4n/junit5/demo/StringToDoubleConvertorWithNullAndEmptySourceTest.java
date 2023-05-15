package com.san4n.junit5.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertNull;


class StringToDoubleConvertorWithNullAndEmptySourceTest {

    private StringToDoubleConvertor stringToDoubleConvertor;


    @BeforeEach
    void beforeEachUnitTest() {
        stringToDoubleConvertor = new StringToDoubleConvertor();
    }


    @ParameterizedTest
    @NullSource
    void givenNullString_whenConvert_thenReturnNull(String value){
        Double actualValue = stringToDoubleConvertor.convert(value);

        assertNull(actualValue);
    }

    @ParameterizedTest
    @EmptySource
    void givenEmptyString_whenConvert_thenReturnNull(String value){
        Double actualValue = stringToDoubleConvertor.convert(value);

        assertNull(actualValue);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void givenNullAndEmptyString_whenConvert_thenReturnNull(String value){
        Double actualValue = stringToDoubleConvertor.convert(value);

        assertNull(actualValue);
    }

}