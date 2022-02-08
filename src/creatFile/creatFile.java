package creatFile;

import java.io.File;
import java.io.IOException;

public class creatFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/creatFile/shaBi.txt");
        file.createNewFile();
        File file2 = new File("./src/creatFile/shaBi");
        System.out.println(file2.mkdir());
    }
}
