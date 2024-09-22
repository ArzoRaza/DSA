import java.util.*;

public class DataProcessor {
    public List<String> processData(List<String> data) {
        List<String> processedData = new ArrayList<>();
        for (String line : data) {
            processedData.add(line.toUpperCase());
        }
        return processedData;
    }
}
