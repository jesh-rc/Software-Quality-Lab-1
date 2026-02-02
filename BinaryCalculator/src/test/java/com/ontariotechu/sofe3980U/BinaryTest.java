package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    // --- existing constructor and add tests ---
    @Test
    public void normalConstructor() { Binary binary = new Binary("1001001"); assertTrue(binary.getValue().equals("1001001")); }

    @Test
    public void constructorWithInvalidDigits() { Binary binary = new Binary("1001001211"); assertTrue(binary.getValue().equals("0")); }

    @Test
    public void constructorWithInvalidChars() { Binary binary = new Binary("1001001A"); assertTrue(binary.getValue().equals("0")); }

    @Test
    public void constructorWithNegativeSign() { Binary binary = new Binary("-1001001"); assertTrue(binary.getValue().equals("0")); }

    @Test
    public void constructorWithZeroTailing() { Binary binary = new Binary("00001001"); assertTrue(binary.getValue().equals("1001")); }

    @Test
    public void constructorEmptyString() { Binary binary = new Binary(""); assertTrue(binary.getValue().equals("0")); }

    @Test
    public void add() { Binary binary1 = new Binary("1000"); Binary binary2 = new Binary("1111"); Binary binary3 = Binary.add(binary1, binary2); assertTrue(binary3.getValue().equals("10111")); }

    @Test
    public void add2() { Binary binary1 = new Binary("1010"); Binary binary2 = new Binary("11"); Binary binary3 = Binary.add(binary1, binary2); assertTrue(binary3.getValue().equals("1101")); }

    @Test
    public void add3() { Binary binary1 = new Binary("11"); Binary binary2 = new Binary("1010"); Binary binary3 = Binary.add(binary1, binary2); assertTrue(binary3.getValue().equals("1101")); }

    @Test
    public void add4() { Binary binary1 = new Binary("0"); Binary binary2 = new Binary("1010"); Binary binary3 = Binary.add(binary1, binary2); assertTrue(binary3.getValue().equals("1010")); }

    @Test
    public void add5() { Binary binary1 = new Binary("0"); Binary binary2 = new Binary("0"); Binary binary3 = Binary.add(binary1, binary2); assertTrue(binary3.getValue().equals("0")); }

    // --- Test cases for OR, AND, and MULTIPLY ---
    
    @Test
    public void testOr() {
        Binary a = new Binary("1010");
        Binary b = new Binary("1100");
        Binary result = a.or(b);
        assertTrue(result.getValue().equals("1110"));
    }

    @Test
    public void testAnd() {
        Binary a = new Binary("1010");
        Binary b = new Binary("1100");
        Binary result = a.and(b);
        assertTrue(result.getValue().equals("1000"));
    }

    @Test
    public void testMultiply() {
        Binary a = new Binary("101"); 
        Binary b = new Binary("11");  
        Binary result = a.multiply(b); 
        assertTrue(result.getValue().equals("1111"));
    }

    @Test
    public void testOrWithZero() {
        Binary a = new Binary("10101");
        Binary b = new Binary("0");
        assertTrue(a.or(b).getValue().equals("10101"));
    }

    @Test
    public void testAndWithZero() {
        Binary a = new Binary("10101");
        Binary b = new Binary("0");
        assertTrue(a.and(b).getValue().equals("0"));
    }

    @Test
    public void testMultiplyWithZero() {
        Binary a = new Binary("10101");
        Binary b = new Binary("0");
        assertTrue(a.multiply(b).getValue().equals("0"));
    }

    @Test
    public void testOrDifferentLengths() {
        Binary a = new Binary("101");
        Binary b = new Binary("11011");
        Binary result = a.or(b);
        assertTrue(result.getValue().equals("11111"));
    }

    @Test
    public void testAndDifferentLengths() {
        Binary a = new Binary("101");
        Binary b = new Binary("11011");
        Binary result = a.and(b);
        assertTrue(result.getValue().equals("1"));
    }

    @Test
    public void testMultiplyByOne() {
        Binary a = new Binary("1011"); 
        Binary b = new Binary("1");    
        Binary result = a.multiply(b);
        assertTrue(result.getValue().equals("1011"));
    }
}
