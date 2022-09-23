import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/* 
    @author Mehul Jain 
*/

public class CSVParser {
    private static final String RESOURCES = "example.csv";
    public static void main(String[] args) throws Exception {
        final Path path = Paths.get(RESOURCES);

        final List<String> lines = Files.readAllLines(path);
        double total = 0;
        for (final String line : lines) {
            String[] columns = line.split(",");
            double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        // print total transaction
        System.out.println("The total for all transactions is " + total);
    }
}
