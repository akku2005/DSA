package IO;

import java.io.*;

public class writeFileName {
    public static void main(String[] args) {
        try {
            FileWriter fileReader = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);

            bufferedWriter.write("Hello from akash");
            bufferedWriter.newLine();
            bufferedWriter.write("This is the new line ");
            bufferedWriter.close();
            fileReader.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
