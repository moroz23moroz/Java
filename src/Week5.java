import java.util.Scanner;

public class Week5 {
    public static void main(String[] args) {
        System.out.println("Введите температуру на улице");

        Scanner inputInt = new Scanner(System.in);
        int a = inputInt.nextInt();

        if (a < 0) {
            System.out.println("Сейчас очень холодно");
        } else if (a == 0 || a <= 16) {
            System.out.println("Сейчас прохладно");
        } else {
            System.out.println("Отличный летний денек");
        }

    }
}
