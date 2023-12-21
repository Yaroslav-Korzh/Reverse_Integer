package org.example;

public class Main {

    public static void main(String[] args) {
        int x = 4321;
        int reverse = 0;
        int remainder;

        for (; x != 0; x = x/10) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;

        }
        System.out.println(reverse);
    }
}