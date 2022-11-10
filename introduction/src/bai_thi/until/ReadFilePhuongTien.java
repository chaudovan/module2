package bai_thi.until;

import bai_thi.model.Oto;
import bai_thi.model.PhuongTien;
import bai_thi.model.XeTai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFilePhuongTien {
    //        public static void writeFileAccount(List<PhuongTien> phuongTienList, String filename) {
//            try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
//                for (PhuongTien phuongTien : phuongTienList) {
//                    buffered.write(phuongTien.getInfo());
//                    buffered.newLine();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    public static List<PhuongTien> readFilePhuongTien(String filename) {
        List<PhuongTien> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] data = line.split(",");
                int loaiPhuongTien = Integer.parseInt(data[6]);
                if (loaiPhuongTien==0) {
                    list.add(new Oto(line));
                } else {
                    list.add(new XeTai(line));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
