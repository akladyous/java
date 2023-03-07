import com.practice.functional.FunctionDemo;
import com.practice.strings.SeatListGenerator;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;


public class Main {


  public static void main(String[] args) {

		//List<String> seats = SeatListGenerator.generateSeatList(6, 3, 'A');
		//System.out.println(Arrays.toString(seats.toArray()));


    System.out.println("multiply by 2");
    for (int i=1; i <=10 ; i++) {
      int multiply = i << 1;
      System.out.format("%d << %-4d", i, multiply);
    }
    System.out.println();
    System.out.println("divide bt 2");
    for (int i=1; i <=10 ; i++) {
      int divide = i >> 1;
      System.out.format("%d << %-4d", i, divide);
    }

  }

}
