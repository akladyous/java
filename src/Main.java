import com.practice.generics.AddTwoNums;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    AddTwoNums<Integer> numsInteger = new AddTwoNums<>(1, 2);
    AddTwoNums<Double> numsDouble = new AddTwoNums<>(1.11, 2.22);
    numsInteger.print();
    numsDouble.print();
  }
}
