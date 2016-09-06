import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    int side1 = Integer.parseInt(console.readLine("What is the length of side one?"));
    int side2 = Integer.parseInt(console.readLine("What is the length of side two?"));
    int side3 = Integer.parseInt(console.readLine("What is the length of side three?"));

    Triangle triangle1 = new Triangle(side1, side2, side3);
    Triangle.checkTriangle(side1, side2, side3);
  }
}
