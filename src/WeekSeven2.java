import java.util.ArrayList;

public class WeekSeven2 {
    public static void main(String[] args) {
        int[] intArray = {11, 12, 25, 90, 56, 18, 299, 98, 97, 23};
        ArrayList<Integer> newInts = new ArrayList<>();

        for (int elem : intArray) {
            if (elem % 2 != 0) {
                newInts.add(elem);
                elem = 0;
                System.out.println(elem);
            } else {
                System.out.println(elem);
            }
        }

        System.out.println("Список нечетных чисел массива:");

        for (int el : newInts) {
            System.out.println(el);
        }
    }
}
