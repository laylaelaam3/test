package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class file {
    public static void main(String[] args) throws IOException {
        File file=new File("fichier.txt");
        FileWriter fileWriter=new FileWriter(file);
        PrintWriter printWriter=new PrintWriter (fileWriter);
        printWriter.print("test");
        printWriter.close();

    }

}
