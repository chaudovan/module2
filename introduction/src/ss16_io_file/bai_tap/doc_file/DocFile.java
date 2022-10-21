package ss16_io_file.bai_tap.doc_file;
import java.io.*;
public class DocFile {
    public static void main(String[] args) throws Exception{
        try(FileReader fileReader = new FileReader("src/ss16_io_file/bai_tap/doc_file/country.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while (true){
                line = bufferedReader.readLine();
                if(line==null){
                    break;
                }
                String[] arr = line.split(",");
                System.out.print(arr[0] + "," + arr[1] + "," + arr[2] );
                System.out.println();
            }
        }catch (FileNotFoundException e){
            e.getMessage();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
