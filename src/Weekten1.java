import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weekten1 {
    public static void main(String[] args) throws IOException{
        InputStreamReader inputStreamReader = null;
        FileWriter fileWriter = null;
        String s = "";
        try {
            inputStreamReader = new InputStreamReader(System.in);
            fileWriter = new FileWriter("text.txt");
            System.out.println("Введите строку в консоль");
            int inChar = inputStreamReader.read();
            while (inputStreamReader.ready()) {
                s = s + (char) inChar;
                inChar = inputStreamReader.read();
            }
            fileWriter.write(s);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}

