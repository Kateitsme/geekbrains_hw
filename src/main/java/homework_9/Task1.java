package homework_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static int countSequence (Path path, String sequence) throws IOException {

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            int nextChar = 0;
            do {
                if (sb.length() < sequence.length()) {
                    sb.append((char) nextChar);
                    continue;
                } else if (sb.toString().equals(sequence))
                    count++;
                sb.deleteCharAt(0);
                sb.append((char) nextChar);
            }while ((nextChar = reader.read()) != -1);
            if (sb.toString().equals(sequence))
                count++;
            return count;
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println(countSequence(Paths.get("test.txt"), "aaa"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
