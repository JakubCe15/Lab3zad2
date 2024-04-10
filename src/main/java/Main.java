import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj wymiary trójkąta:  ");
    int Ramię = scanner.nextInt();
    for (int i = 1; i <= Ramię; i++) {
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i || i == Ramię) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i < Ramię; i++) {
      for (int j = 1; j <= Ramię - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}