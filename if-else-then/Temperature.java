import java.io.Console;

public class Temperature {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What's today's temperature?");
    String tempStr = console.readLine();
    Integer tempInt = Integer.parseInt(tempStr);

    // Boolean freezing = tempInt = 30;
    // Boolean cold = tempInt = 50;
    // Boolean warm = tempInt = 80;
    // Boolean hot = tempInt = 90;

    if(tempInt > 90) {
      System.out.println("It's hot as sh*t!");
    } else if (tempInt < 90 && tempInt >=60) {
      System.out.println("It's pretty warm out.....");
    } else if (tempInt < 60 && tempInt >= 30) {
      System.out.println("It's pretty cool out.....");
    } else {
      System.out.println("It's f**king FREEZING outside!");
    }
  }
}
