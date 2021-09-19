import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class project1_NR {
    public static void main(String[] args) throws IOException {
        var reader = new Scanner(System.in);
        var userResponse = "";
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
            System.out.println("Product: " + name.get(i) + "\nPrice: " + price.get(i) + "\nStock available: " + numAvailable.get(i) + "\n");
        }
        while (!userResponse.equals("done"))    {
            System.out.println("Type in the item you want to look for. Type 'done' if you do not want to look for any more items.");
            userResponse = reader.nextLine();
            if (!userResponse.equals("done"))   {
                name.add(userResponse);
            }
        }
    }
}
