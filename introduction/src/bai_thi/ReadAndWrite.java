package bai_thi;


import bai_thi.model.Oto;
import bai_thi.model.XeTai;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
//    public static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//    public static void writeOto(String path, List<Oto> otoList){
//        try(BufferedWriter buffered = new BufferedWriter(new FileWriter(path))) {
//            for(Oto oto:otoList){
//  //              buffered.write(oto.getInFo());
//                buffered.newLine();
//            }
//        } catch(FileNotFoundException ex) {
//            System.out.println("file ko tồn tại");
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static List<Oto> readDataFromFileOto(String path){
//        List<Oto> otoList = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                if (line.trim().equals("")) {
//                    continue;
//                }
//                otoList.add(new Oto(line));
//            }
//        } catch(FileNotFoundException ex) {
//            System.out.println("file ko tồn tại");
//        }catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return otoList;
//    }
//    public static void writeXeTai(String path, List<XeTai> xeTaiList){
//        try(BufferedWriter buffered = new BufferedWriter(new FileWriter(path))) {
//            for(XeTai x:xeTaiList){
//        //        buffered.write(x.getInFo());
//                buffered.newLine();
//            }
//        } catch(FileNotFoundException ex) {
//            System.out.println("file ko tồn tại");
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static List<XeTai> readDataFromFileXeTai(String path){
//        List<XeTai> xeTaiList = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                if (line.trim().equals("")) {
//                    continue;
//                }
//                xeTaiList.add(new XeTai(line));
//            }
//        } catch(FileNotFoundException ex) {
//            System.out.println("file ko tồn tại");
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//        return xeTaiList;
//    }
}
