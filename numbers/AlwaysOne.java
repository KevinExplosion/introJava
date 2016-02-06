import java.io.Console;

public class AlwaysOne {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter any number");

    Integer yourNumber = Integer.parseInt(myConsole.readLine());
    Integer unitNumber = yourNumber / yourNumber;

    System.out.println("Your number WAS " + yourNumber + ", but I've converted it to " + unitNumber + ".");
  }
}
