package com.service;

public class StringConvert {
    public static Integer convToInteger(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Input should not be null or empty");
        } else {
            return Integer.valueOf(str);
        }
    }
}
