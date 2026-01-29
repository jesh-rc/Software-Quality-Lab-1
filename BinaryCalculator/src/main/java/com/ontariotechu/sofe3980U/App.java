package com.ontariotechu.sofe3980U;

import java.time.LocalTime;  // Use Java built-in time

public class App {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();  // get current local time
        System.out.println("The current local time is: " + currentTime);

        Binary binary1 = new Binary("00010001000");
        System.out.println("First binary number is " + binary1.getValue());

        Binary binary2 = new Binary("111000");
        System.out.println("Second binary number is " + binary2.getValue());

        Binary sum = Binary.add(binary1, binary2);
        Binary orResult = binary1.or(binary2);
        Binary andResult = binary1.and(binary2);
        Binary multiplyResult = binary1.multiply(binary2);

        System.out.println("ADD result: " + sum.getValue());
        System.out.println("OR result: " + orResult.getValue());
        System.out.println("AND result: " + andResult.getValue());
        System.out.println("MULTIPLY result: " + multiplyResult.getValue());
    }
}
