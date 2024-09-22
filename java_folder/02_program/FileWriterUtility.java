import java.io.*;
import java.util.*;

public class FileWriterUtility {
    private String outputPath;

    public FileWriterUtility(String outputPath) {
        this.outputPath = outputPath;
    }

    public void saveData(List<String> data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
        for (String line : data) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}
