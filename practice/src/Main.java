import com.practice.functional.FunctionDemo;
import com.practice.strings.SeatListGenerator;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;


public class Main {


  public static void main(String[] args) {

		List<String> seats = SeatListGenerator.generateSeatList(6, 3, 'A');
		System.out.println(Arrays.toString(seats.toArray()));




  }

}
