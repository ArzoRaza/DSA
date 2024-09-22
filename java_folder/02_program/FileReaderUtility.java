import java.io.*;
import java.util.*;

public class FileReaderUtility {
    private String filePath;

    public FileReaderUtility(String filePath) {
        this.filePath = filePath;
    }

    public List<String> readData() throws IOException {
        List<String> data = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            data.add(line);
        }
        reader.close();
        return data;
    }
}
