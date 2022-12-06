public class WeekSeven1 {
    public static void main(String[] args) {
        int[] intArray = {11, 12, 25, 90, 56, 18, 299, 98, 97, 23};
        double sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            sum = sum + intArray[i];
        }

        double result = sum / intArray.length;

        System.out.println("Среднее арифметическое этих чисел: " + result);
    }
}
