import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Wahlen Sie Lösungmethode");
        System.out.println(" 1. Addiren");
        System.out.println(" 2. Subtraktion");
        System.out.println(" 3. Multiplikation");
        System.out.println(" 4. Teilung");
        System.out.print("--> ");
        int choice = new Scanner(System.in).nextInt();

        System.out.println("Geben Sie erste Zahl ein");
        double num1 = new Scanner(System.in).nextDouble();
        System.out.println("Geben Sie Zweite Zahl ein");
        double num2 =new Scanner(System.in).nextDouble();
        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4){
            result = num1 / num2;
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println(" Ergebnis: " + result);

    }
}
