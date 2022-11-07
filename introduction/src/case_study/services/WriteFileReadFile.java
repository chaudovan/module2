package case_study.services;

//import ss17_doc_file_ghi_file.bai_tap.Product;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteFileReadFile {
//    public static  void write(String path,List<Employee> employees){
//        try(BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(path))){
//            for(Employee employee:employees){
//                bufferedWriter.write(employee.getInFo());
//                bufferedWriter.newLine();
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }

    public static void writeToFile(String pathFile, String data) {
        File file = new File(pathFile);
        if(!file.exists()){
            System.out.println("file không tồn tại hoặc sai đường dẫn");
        }
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String[]> readToFile(String pathFile) {
        File file = new File(pathFile);
        List<String[]> stringList = new ArrayList<>();
        String line;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] stringArr = line.split(",");
                stringList.add(stringArr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
