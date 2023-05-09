package com.san4n.junit5.demo;

import java.util.Objects;

public class StringToDoubleConvertor {

    public Double convert(String value){
        if(Objects.isNull(value))
            return null;
        else if (value.isEmpty())
            return null;
        else if (value.isBlank())
            return null;

        return Double.parseDouble(value);
    }

}
