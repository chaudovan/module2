package ss16_io_file.bai_tap.copy_file;
import java.io.*;
public class CopyFile {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("src/ss16_io_file/bai_tap/copy_file/file1.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("src/ss16_io_file/bai_tap/copy_file/file2.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            String line;
            while (true){
                line = bufferedReader.readLine();
                if(line==null){
                    break;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
