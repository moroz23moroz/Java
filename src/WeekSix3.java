import java.math.BigInteger;
import java.util.Scanner;

public class WeekSix3 {
    public static void main(String[] args) {
        System.out.println("Введите неотрицательное целое число");

        Scanner inputInt = new Scanner(System.in);
        int value = inputInt.nextInt();
        long f = 1L;

        if (value >= 26) {
            System.out.println("На данный момент моих знаний не хватает написать такую программу");
        } else {
            for (int i = 1; i <= value; i++) {
                f = f * i;
            }
            System.out.println("Факториал числа равен " + f);
        }
    }
}
