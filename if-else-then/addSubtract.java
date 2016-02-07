import java.io.Console;

public class addSubtract {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Give me a number, lil' bish! I will add 1 if it's greater than or equal to 0, but I will subtract 1 if it's negative!");

    String addSubtractString = console.readLine();

    Integer addSubtractInteger = Integer.parseInt(addSubtractString);

    if (addSubtractInteger < 0) {
      System.out.println("Fool! Your new number is " + (addSubtractInteger - 1) + ".");
    } else {
      System.out.println("I see...your new number is " + (addSubtractInteger + 1) + ".");
    }
  }
}
