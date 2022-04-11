import java.util.HashMap;
import java.util.Map;

public class Puzzle {
  public static void main(String[] args) {
    AdditionPuzzle(5, 10);
    Swap2NumbersPuzzle(5, 10);
    System.out.println("PrintNumbersFrom1toNPuzzle: ");
    PrintNumbersFrom1toNPuzzle(15);
    System.out.println(' ');
    PrintSemicolonPuzzle();
    EqualIntegersPuzzle(5, 5);
  }

  // Add two numbers without using the addition operator.
  static void AdditionPuzzle(int a, int b) {
    System.out.println("AdditionPuzzle: ");
    if (a == 0) {
      System.out.print(b);
    }
    if (b == 0) {
      System.out.print(a);
    }

    for (int i = 1; i <= b; i++) {
      a++;
    }
    System.out.println(a);
  }

  // Swap 2 numbers without using a third variable.

  static void Swap2NumbersPuzzle(int a, int b) {
    System.out.println("Swap2NumbersPuzzle: ");
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a: " + a + " b: " + b);
  }

  // Print numbers from 1 to N without using any looping construct.
  static void PrintNumbersFrom1toNPuzzle(int n) {
    if (n > 0) {
      PrintNumbersFrom1toNPuzzle(n - 1);
      System.out.print(n + " ");
    }
  }

  // Print a semicolon without using a semicolon in the program
  static void PrintSemicolonPuzzle() {
    System.out.println("PrintSemicolonPuzzle: ");
    char semicolon = 59;
    System.out.println(semicolon);
  }

  // Determine if 2 integers are equal without using comparison and arithmetic
  // operators.
  static void EqualIntegersPuzzle(int a, int b) {
    System.out.println("EqualIntegersPuzzle: ");
    Map<Integer, Boolean> map = new HashMap<>();
    map.put(a, true);

    if (map.containsKey(b)) {
      System.out.println("Is equal");
    } else {
      System.out.println("Is not equal");
    }
  }
}