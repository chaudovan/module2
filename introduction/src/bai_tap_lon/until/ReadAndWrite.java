package bai_tap_lon.until;



import bai_tap_lon.model.AccountLessor;
import bai_tap_lon.model.AccountRentter;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public static void writeAccountlessor(String path, List<AccountLessor> accountLessors){
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
    public static List<AccountLessor> readDataFromFileAccountLessor(String path){
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
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return accountLessors;
    }
    public static void writeAccountRentter(String path, List<AccountRentter> accountRentters){
        try(BufferedWriter buffered = new BufferedWriter(new FileWriter(path))) {
            for(AccountRentter accountRentter:accountRentters){
                buffered.write(accountRentter.getInFo());
                buffered.newLine();
            }
        } catch(FileNotFoundException ex) {
            System.out.println("file ko tồn tại");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static List<AccountRentter> readDataFromFileAccountRentter(String path){
        List<AccountRentter> accountRentters = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                accountRentters.add(new AccountRentter(line));
            }
        } catch(FileNotFoundException ex) {
            System.out.println("file ko tồn tại");
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return accountRentters;
    }
}
