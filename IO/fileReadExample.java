package IO;

import java.io.*;

public class fileReadExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("io.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
