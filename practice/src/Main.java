import com.practice.functional.FunctionDemo;
import com.practice.strings.SeatListGenerator;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;


public class Main {


  @Override
  protected void finalize() throws Throwable {
    super.finalize();
  }

  public static void main(String[] args) {

		//List<String> seats = SeatListGenerator.generateSeatList(6, 3, 'A');
		//System.out.println(Arrays.toString(seats.toArray()));

    int[] stack = new int[2];
    stack[0] = 0;
    stack[1] = 1;
    System.out.println(Arrays.toString(stack));
    System.out.println("hashCode : " + stack.hashCode());
    stack = new int[stack.length + 5];
//    stack[0]=0;
//    stack[0]=1;
    System.out.println(Arrays.toString(stack));
    System.out.println("hashCode : " + stack.hashCode());

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
