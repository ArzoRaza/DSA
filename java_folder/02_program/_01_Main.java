import java.io.IOException;
import java.util.List;

public class _01_Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        FileReaderUtility fileReader = new FileReaderUtility(inputFilePath);
        DataProcessor dataProcessor = new DataProcessor();
        FileWriterUtility fileWriter = new FileWriterUtility(outputFilePath);

        try {
            List<String> data = fileReader.readData();
            List<String> processedData = dataProcessor.processData(data);
            fileWriter.saveData(processedData);
            System.out.println("Kaam Chal raha hai, apka kam aiga output.txt aise karke");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
