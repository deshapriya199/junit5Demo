package com.san4n.junit5.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNull;

class StringToDoubleConvertorWithMethodSourceTest {

    private StringToDoubleConvertor stringToDoubleConvertor;


    @BeforeEach
    void beforeEachUnitTest() {
        stringToDoubleConvertor = new StringToDoubleConvertor();
    }

    @ParameterizedTest
    @MethodSource
    void givenNullString_whenConvert_thenReturnNull(String value){
        Double actualValue = stringToDoubleConvertor.convert(value);

        assertNull(actualValue);
    }

    private static Stream<Arguments> givenNullString_whenConvert_thenReturnNull(){
        return Stream.of(
                Arguments.of(""),
                Arguments.of(" ")
        );
    }

}