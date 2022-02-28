import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesDemo {
    public static void main(String[] args) {
        Path currentDir = Paths.get(".");
        Path demoFile_1 = currentDir.resolve("src/DemoFile1.txt");
        Path demoFile_2 = currentDir.resolve("src/DemoFile2.txt");
        Path demoFile_3 = currentDir.resolve("src/DemoFile3.txt");
        Path demoFile_4 = currentDir.resolve("src/DemoFile4.txt");
        try {
            //readString(Path path) method
            //String fileContents = Files.readString(demoFile_1);
            //System.out.println("Contents of DemoFile1 are : "+fileContents);

            //readString(Path path, Charset cs) method
            //fileContents = Files.readString(demoFile_2, StandardCharsets.US_ASCII);
            //fileContents = Files.readString(demoFile_2, StandardCharsets.UTF_8);
            //System.out.println("Contents of DemoFile2 are : "+fileContents);

            // writeString(Path path, CharSequence csq, OpenOption... options)
            //String s1 = "This string will be written to file named DemoFile3.txt";
            //Path pathToNewFile = Files.writeString(demoFile_3, s, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            //System.out.println("Absolute path to newly written file: "+ pathToNewFile.toAbsolutePath().toString());
            //Example of IllegalArgumentException
            //pathToNewFile = Files.writeString(demoFile_3, s, StandardOpenOption.APPEND, StandardOpenOption.TRUNCATE_EXISTING);

            //writeString(Path path, CharSequence csq, Charset cs, OpenOption... options)
            String s2 = "Hi there,\nThis string will be written to file named DemoFile4.txt.";
            String utfCharStr = "x√ab c";
            Path pathToNewFile = Files.writeString(demoFile_4, s2, StandardCharsets.UTF_8,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Absolute path to newly written file: "+ pathToNewFile.toAbsolutePath().toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
