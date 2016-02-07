import java.io.Console;

public class conditionalPractice {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Carl, what did you do?!");
    String whatCarlDid = console.readLine();

    if (whatCarlDid.startsWith("No")) {
      System.out.println("Caaaaaaaaaaaaaaaarl!...");
    } else {
      System.out.println("Why is there a dead human in our apartment?");
    }
  }
}
