package thi_thu.model;

import ss17_doc_file_ghi_file.bai_tap.Product;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadAndWrite {
    public static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public static void write(String path, List<AccountLessor> accountLessors){
        try(BufferedWriter buffered = new BufferedWriter(new FileWriter(path))) {
            for(AccountLessor accountLessor:accountLessors){
                buffered.write(accountLessor.getInFo());
                buffered.newLine();
            }
        } catch(FileNotFoundException ex) {
            System.out.println("file ko tồn tại");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static List<AccountLessor> readDataFromFile(String path){
        List<AccountLessor> accountLessors = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }

                accountLessors.add(new AccountLessor(line));
            }
        } catch(FileNotFoundException ex) {
            System.out.println("file ko tồn tại");
        }catch (IOException e) {
            e.printStackTrace();
        }
        return accountLessors;
    }
}
