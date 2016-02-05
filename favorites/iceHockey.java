import java.io.Console;

public class iceHockey {
  public static void main(String[] args) {

    Console myConsole = System.console();

    System.out.println("What is your name?");
    String name = myConsole.readLine();
    System.out.println("Who is your favorite hockey team?");
    String team = myConsole.readLine();
    System.out.println("What color is their jersey?");
    String color = myConsole.readLine();
    System.out.println("Who's your favorite player on the team?");
    String player = myConsole.readLine();
    System.out.println("This is " + name + ". " + name + "'s favorite hockey team is " + team + ". Their jersey is " + color + ". " + name + "'s favorite player on the team is " + player + ".");
  }
}
