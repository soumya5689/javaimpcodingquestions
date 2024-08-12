package Array;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FoundCount {
        public static void main(String[] args) {
            String filePath = "C:\\Users\\91637\\Documents\\java.txt";
            String word = "java";
            int count = countWordOccurrences(filePath, word);
            System.out.println(count);
        }

        public static int countWordOccurrences(String filePath, String wordCount) {
            int count = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String convertLine = line.toLowerCase();
                    String convertWord = wordCount.toLowerCase();
                    String[] words = convertLine.split("\\W+");
                    for (String word : words) {
                        if (word.equals(convertWord)) {
                            count++;
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            return count;
        }

}
