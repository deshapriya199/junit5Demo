package com.san4n.junit5.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertNull;

/**
 *This argument source will only provide an empty argument for the following method parameter types. Subtypes of the supported types are not supported.
 * String
 * java.util.List
 * java.util.Set
 * java.util.Map
 * primitive arrays — for example int[], char[][], etc.
 * object arrays — for example String[], Integer[][], etc.
 */
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