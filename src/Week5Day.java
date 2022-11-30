import java.util.Scanner;

public class Week5Day {
    enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        Days i = Days.SUNDAY;

        switch (i) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Этот день выходной");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Этот день будний");
                break;
        }
    }
}
