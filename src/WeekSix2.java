public class WeekSix2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i == 5) {
                i++;
                continue;
            } else if (i == 25){
                i++;
                continue;
            } else if (i == 49) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
