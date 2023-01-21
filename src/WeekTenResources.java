import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekTenResources {
    public static void main(String[] args) {
        String s = "";
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            FileWriter fileWriter = new FileWriter("text.txt")) {
            System.out.println("Введите строку в консоль");
            int inChar = inputStreamReader.read();
            while (inputStreamReader.ready()) {
                s = s + (char) inChar;
                inChar = inputStreamReader.read();
            }
            fileWriter.write(s);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        }
    }
