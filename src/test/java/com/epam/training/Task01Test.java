package com.epam.training;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;
import java.lang.Error;

import static org.junit.Assert.assertTrue;

public class Task01Test {

    @Test
    public void testIncomingLineIncorrect()
    {
        Assert.assertTrue(Task01.isNotValidNumber("de"));
        Assert.assertTrue(Task01.isNotValidNumber("999"));
        Assert.assertTrue(Task01.isNotValidNumber(""));
        Assert.assertTrue(Task01.isNotValidNumber("10000"));

    }

    @Test
    public void testIncomingLineCorrect()
    {
        Assert.assertFalse(Task01.isNotValidNumber("1111"));
        Assert.assertFalse(Task01.isNotValidNumber("1234"));
        Assert.assertFalse(Task01.isNotValidNumber("1000"));
        Assert.assertFalse(Task01.isNotValidNumber("9999"));
    }

    @Test
    public void testDigitSummaryComparisonCorrect()
    {
        Assert.assertTrue(Task01.checkSumOfNumberPairs(1212));
        Assert.assertTrue(Task01.checkSumOfNumberPairs(3333));
        Assert.assertTrue(Task01.checkSumOfNumberPairs(1762));
    }

    @Test
    public void testDigitSummaryComparisonIncorrect()
    {
        Assert.assertFalse(Task01.checkSumOfNumberPairs(1222));
        Assert.assertFalse(Task01.checkSumOfNumberPairs(1034));
        Assert.assertFalse(Task01.checkSumOfNumberPairs(5600));
    }


}
