import java.io.Console;

public class musician {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What's your name?");
    String name = myConsole.readLine();
    System.out.println("Hi there, " + name + ". What instrument do you play?");
    String instrument = myConsole.readLine();
    System.out.println("How many years have you been playing " + instrument + "?");
    String years = myConsole.readLine();
    System.out.println("This is my friend, " + name + ". " + name + " has been playing " + instrument + " for " + years + " years!");
  }
}
