import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeekEight2 {
    public static void main(String[] args) {
        HashMap<String, String> programmersList = new HashMap<>();

        programmersList.put("Goland", "Morozecki");
        programmersList.put("Solidity", "Moroz MaV");
        programmersList.put("Dart", "Geralt Neo");
        programmersList.put("JavaScript", "Eren Jagger");

        Set<String> langs = programmersList.keySet();
        ArrayList<String> programmers = new ArrayList<>(programmersList.values());

        for (Map.Entry<String, String> el:
             programmersList.entrySet()) {
            System.out.println(el);
        }

        System.out.println("Языки программирования в проекте:");
        for (String lang :
                langs) {
            System.out.println(lang);
        }

        System.out.println("Программисты:");
        for (String programmer :
                programmers) {
            System.out.println(programmer);
        }
    }
}
