import java.util.LinkedList;

public class WeekEight1 {
    public static void main(String[] args) {
        LinkedList<String> programLangs = new LinkedList<>();

        programLangs.addLast("C++");
        programLangs.add("Solidity");
        programLangs.addFirst("PHP");
        programLangs.add("JavaScript");
        programLangs.add(1, "Goland");
        programLangs.add("Dart");

        System.out.println(programLangs);
        System.out.println(programLangs.peekFirst());
        System.out.println(programLangs.peekLast());
        System.out.println(programLangs.pollFirst());
        System.out.println(programLangs.pollLast());
        System.out.println(programLangs);

    }
}
