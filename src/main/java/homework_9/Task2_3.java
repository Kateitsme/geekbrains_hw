package homework_9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.LinkedList;
import java.util.List;

public class Task2_3 {
    public static void joinFiles(Path directory, Path fileToJoin) throws IOException {
        Files.createFile(fileToJoin);
        int nextChar = 0;
        try (BufferedWriter writer = Files.newBufferedWriter(fileToJoin, StandardCharsets.UTF_8)) {
            for (File file : directory.toFile().listFiles())
                if (!file.isDirectory())
                    Files.copy(Paths.get(String.valueOf(file)), fileToJoin, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    static public void deleteDirectory(File path) {
        if (path.exists()) {
            File[] files = path.listFiles();
            for (File file : files) {
                if (file.isDirectory()) deleteDirectory(file);
                else file.delete();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        joinFiles(Paths.get("C:\\Users\\ВТБ\\Desktop\\aa"), Paths.get("test2.txt"));
        deleteDirectory(new File("C:\\Users\\ВТБ\\Desktop\\aa"));
    }


}
