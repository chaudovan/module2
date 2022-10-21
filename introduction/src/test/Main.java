package test;

import java.io.*;
import java.io.InputStream;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IOException{
//        File fileOne = new File("src/test/test1.csv");
//        File fileTwo = new File("src/test/test2.csv");
//        try (FileReader fileReader = new FileReader("src/test/test1.csv");
//             BufferedReader bufferedReader = new BufferedReader(fileReader);
//             FileWriter fileWriter = new FileWriter("src/test/test2.csv");
//             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
//            String line;
//            while (true) {
//                line = bufferedReader.readLine();
//                if (line == null) {
//                    break;
//                }
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("src/test/chau.csv"));
            outStream = new FileOutputStream(new File("src/test/bin.csv"));
            byte[] buffer = new byte[1024];
            int length;

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inStream.close();
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
