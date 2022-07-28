import java.io.*;

public class FileExample {
    public static void main(String args[]) throws IOException {
        File file = new File("../codestates.txt");

        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.canWrite());
    }
}