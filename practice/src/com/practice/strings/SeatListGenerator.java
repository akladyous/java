package com.practice.strings;

import java.util.ArrayList;
import java.util.List;

public class SeatListGenerator {

    public static void main(String[] args) {
        System.out.println(generateSeatList(10, 4, 'A'));;
    }

    public static List<String> generateSeatList(int seatPerRows, int totalRows, char rowPrefix) {
        List<String> seats = new ArrayList<>();
        int lastRow = (int) Character.valueOf(rowPrefix) + totalRows - 1; // 'A'-> 65 + 4-3 = 68 which is 'C'
        for (char row =rowPrefix; row <= lastRow; row ++ ) {
            for (int seatNum=1; seatNum <= seatPerRows; seatNum ++) {
                seats.add(row + String.format("%02d", seatNum));
            }
        }
        return seats;
    }
}
