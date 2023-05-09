package com.san4n.junit5.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class StringToDoubleConvertorWithCsvSourceTest {

    private StringToDoubleConvertor stringToDoubleConvertor;
    
    @BeforeEach
    void beforeEachUnitTest() {
        stringToDoubleConvertor = new StringToDoubleConvertor();
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "null, null",
                    "'', null",
                    "1, 1.0"
            },
            nullValues = {"null"}
    )
    void givenNullAndEmptyString_whenConvert_thenReturnNull(String value, Double expectedValue){
        Double actualValue = stringToDoubleConvertor.convert(value);

        assertEquals(expectedValue, actualValue);
    }

}