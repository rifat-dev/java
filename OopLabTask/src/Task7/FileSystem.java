
package Task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class FileSystem {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        try {
            File dir = new File("file");
            dir.mkdir();
            File file1 = new File(dir.getAbsolutePath() + "/file.txt");
            file1.createNewFile();
            try (Formatter write = new Formatter(file1.getAbsolutePath())) {
                write.format("%s %s\r\n", "Rifat", "101");
                write.format("%s %s\r\n", "Hasan", "102");
                write.format("%s %s\r\n", "Sadia", "103");
                write.close();
                File fileName = new File(file1.getAbsolutePath());
                try (Scanner read = new Scanner(fileName)) {
                    while (read.hasNext()) {
                        String name = read.next();
                        String id = read.next();
                        System.out.println("Name = "+name+" Id = "+id);
                    }
                    read.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
