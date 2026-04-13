package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Agilefattest {

    Agilefat calculator = new Agilefat();

    @Test
    void testlending1()
    {
        assertEquals("man-by gauresh-lended", calculator.lending("man-by gauresh"));
    }
    @Test
    void testlending2()
    {
        assertEquals("life-by ranveer-lended", calculator.lending("life-by ranveer"));
    }
    @Test
    void testlending3()
    {
        assertEquals("M. adhavan-by adihesh-lended", calculator.lending("M. adhavan-by adihesh"));
    }
}
