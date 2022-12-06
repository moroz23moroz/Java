import java.util.ArrayList;

public class WeekSeven3 {

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        ArrayList<Integer> stringLength = new ArrayList<>();

        books.add("Алгоритмы. Теория и практическое применение");
        books.add("Доверься себе, или Как сохранять спокойствие и уверенность в любых обстоятельствах");
        books.add("Быстрый старт Flutter-разработчика");
        books.add("Ф*к Ю мани. Как перестать зависеть от денег");

        System.out.println("Список моих книг:");
        for (String book :
                books) {
            System.out.println(book);
            int length = book.length();
            stringLength.add(length);
        }

        System.out.println("Длина строки каждого названия книги:");
        for (int elem :
                stringLength) {
            System.out.println(elem);
        }

    }


}
