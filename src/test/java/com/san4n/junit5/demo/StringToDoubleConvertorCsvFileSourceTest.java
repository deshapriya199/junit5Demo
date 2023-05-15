package com.san4n.junit5.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToDoubleConvertorCsvFileSourceTest {

    private StringToDoubleConvertor stringToDoubleConvertor;


    @BeforeEach
    void beforeEachUnitTest() {
        stringToDoubleConvertor = new StringToDoubleConvertor();
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/test-data.csv"}, nullValues = {"null"})
    void givenNullString_whenConvert_thenReturnNull(String value, Double expectedValue){
        Double actualValue = stringToDoubleConvertor.convert(value);

        assertEquals(expectedValue, actualValue);
    }

}