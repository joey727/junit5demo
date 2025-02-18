package com.service;

public class PalidromeCheck {
    public boolean isReverse(String str) {
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }
}
