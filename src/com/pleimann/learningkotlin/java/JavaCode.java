package com.pleimann.learningkotlin.java;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Random;

public class JavaCode {
    public static void main(String args[]) {
        Object result;

        Integer randomNumber = new Random().nextInt(3);
        if(randomNumber == 1) {
            result = new BigDecimal(30);
        } else {
            result = "hello";
        }

        System.out.println(result);

        if(result instanceof BigDecimal) {
            ((BigDecimal)result).add(new BigDecimal(47));
        } else{
            String tempResult = (String)result;
            result = tempResult.toUpperCase(Locale.ROOT);
        }

        System.out.println(result);
    }
}
