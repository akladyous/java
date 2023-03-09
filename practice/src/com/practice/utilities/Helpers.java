package com.practice.utilities;

import java.text.NumberFormat;

public class Helpers {
    public static void main(String[] args) {
        currencyPrinter(234.11339);
    }

    public static void currencyPrinter(double number) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(number));
    }
}
