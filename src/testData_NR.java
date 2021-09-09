import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class testData_NR {
    public static void main(String[] args) throws IOException {
        var names = new ArrayList<String>();
        var grades = new ArrayList<Integer>();
        var fileName = "testdata.txt";
        var filePath = Paths.get(fileName);
        var allLines = Files.readAllLines(filePath);
        for (var line: allLines)  {
            var splitLine = line.split(",");
            names.add(splitLine[0]);
            grades.add(Integer.parseInt(splitLine[1]));
        }
        for(int i = 0; i < names.size(); i++)   {
            System.out.println("Student " + names.get(i) + " has a grade of " + grades.get(i));
        }
    }
}