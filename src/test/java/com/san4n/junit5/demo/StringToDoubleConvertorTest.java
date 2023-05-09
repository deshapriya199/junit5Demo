package com.san4n.junit5.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToDoubleConvertorTest {

    private StringToDoubleConvertor stringToDoubleConvertor;

    @BeforeAll
    static void beforeAllUnitTest() {
        System.out.println("Starting... StringToDoubleConvertorTest");
    }

    @BeforeEach
    void beforeEachUnitTest() {
        System.out.println("Now running ...");
        stringToDoubleConvertor = new StringToDoubleConvertor();
    }

    @AfterAll
    static void afterAllUnitTest() {
        System.out.println("Finishing... StringToDoubleConvertorTest");
    }

    @AfterEach
    void afterEachUnitTest() {
        System.out.println("Stop running ...");
    }

    //check null
    @Test
    @DisplayName("given null string value and expected null value")
    void givenNullString_whenConvert_thenReturnNull(){
        Double actualValue = stringToDoubleConvertor.convert(null);

        assertNull(actualValue);
    }

    @Test
    @Tag("null-return-test")
    void givenEmptyString_whenConvert_thenReturnNull(){
        Double actualValue = stringToDoubleConvertor.convert("");

        assertNull(actualValue);
    }

    @Test
    void givenBlankString_whenConvert_thenReturnNull(){
        Double actualValue = stringToDoubleConvertor.convert(" ");

        assertNull(actualValue);
    }

    @Test
    void givenInvalidString_whenConvert_thenThrowException(){

        NumberFormatException numberFormatException = assertThrows(
                NumberFormatException.class,
                () -> stringToDoubleConvertor.convert("a")
        );

        assertNotNull(numberFormatException);
    }

    @Test
    void givenString_whenConvert_thenReturnDoubleValue(){
        Double actualValue = stringToDoubleConvertor.convert("123");

        assertEquals(123.0, actualValue);
    }

    @Test
    @Disabled("Not yet implemented")
    void givenString_bla_bla(){

    }

}