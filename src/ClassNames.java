import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassNames {
    public static void main(String[] args) throws IOException {
        var fileName = "students.txt";
        var allLines = Files.readString(Paths.get(fileName));
        var listOfNames = allLines.split("\n");
        for (String name : listOfNames) {
            System.out.println(name);
        }
    }
}
