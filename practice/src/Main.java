import com.practice.generics.AddTwoNums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {


  public static void main(String[] args) {
    // System.out.println("Hello world!");

		List<String> seats = new ArrayList<>();
		int searPerRows = 12;
		int lastRow = (int) 'A' + (4 - 1);
		for (char row = 'A'; row <= lastRow; row ++) {
			for (int seatNum = 1; seatNum <= searPerRows; seatNum ++) {
				seats.add(row + String.format("%02d", seatNum));
			}
		}
		System.out.println(Arrays.toString(seats.toArray()));



  }
}
