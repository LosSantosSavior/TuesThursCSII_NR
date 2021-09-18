import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class project1_NR {
    public static void main(String[] args) throws IOException {
        var name = new ArrayList<String>();
        var price = new ArrayList<Float>();
        var numAvailable = new ArrayList<Integer>();
        var fileName = "products.txt";
        var filePath = Paths.get(fileName);
        var allLines = Files.readAllLines(filePath);
        for (var line: allLines) {
            var splitLine = line.split(",");
            name.add(splitLine[0]);
            price.add(Float.parseFloat(splitLine[1]));
            numAvailable.add(Integer.parseInt(splitLine[2]));
        }
        for (int i = 0; i <name.size(); i++)    {
            System.out.println("Product: " + name.get(i) + "\nPrice: " + price.get(i) + "\nStock available: " + numAvailable.get(i));
        }
    }
}
