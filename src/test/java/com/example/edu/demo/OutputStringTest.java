package com.example.edu.demo;

import org.junit.Assert;
import org.junit.Test;

public class OutputStringTest {
    @Test
    public void validNumberSeriesFormat(){
        Assert.assertEquals("6, 7, 8, 9, 10, 11", Application.getNumberSeries(5,36));
    }

    @Test
    public void invalidNumberSeriesFormat(){
        Assert.assertNotEquals("6, 7, 8, 9, 10, 11, ", Application.getNumberSeries(5,36));
    }
}