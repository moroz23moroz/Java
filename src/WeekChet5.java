import java.util.Scanner;

public class WeekChet5 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");

        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        int x = n %= 2;

        String result = x == 0 ? "Вы ввели четное число" : "Вы ввели нечетное число";
        System.out.println(result);
    }
}
