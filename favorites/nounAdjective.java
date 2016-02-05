import java.io.Console;

public class nounAdjective {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please enter a noun.");
    String noun = myConsole.readLine();
    System.out.println("Please describe your noun using an adjective");
    String adjective = myConsole.readLine();
    System.out.println("Enjoy your " + adjective + " " + noun + ", friend!");
  }
}
