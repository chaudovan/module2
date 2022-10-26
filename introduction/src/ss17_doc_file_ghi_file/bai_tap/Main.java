package ss17_doc_file_ghi_file.bai_tap;

import ss17_doc_file_ghi_file.thuc_hanh.doc_ghi_file_nhi_phan.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();
    public static void writeToFile(String path, List<Product> products) {
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(path, true))){
            for (Product product:products){
                buffered.write(product.getInFor());
                buffered.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                products.add(new Product(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
    public static void addProduct(){
        System.out.println("nhập id sản phẩm :");
        String idProduct = sc.nextLine();
        System.out.println("nhập tên sản phẩm :");
        String nameProduct = sc.nextLine();
        System.out.println("Nhà sản xuất của sản phẩm :");
        String nameCompany = sc.nextLine();
        double cost=0;
        boolean check;
        do {
            check=false;
            try{
                System.out.println("nhập giá của sản phẩm :");
                cost = Double.parseDouble(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("nhập sai định dạng,phải nhập số");
                check=true;
            }
        }while (check);


        System.out.println("mô tả khác của sản phẩm :");
        String description = sc.nextLine();
        Product product = new Product(idProduct,nameProduct,nameCompany,cost,description);
        products.add(product);
        writeToFile("src/ss17_doc_file_ghi_file/bai_tap/product.txt",products);
    }
    public static void display(){
        System.out.printf("|%16s|%20s|%20s|%20s|%20s|\n","ID","NameProduct","NameCompany","Cost","Description");
        for (int i = 0; i <104 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        List<Product> productsData = readDataFromFile("src/ss17_doc_file_ghi_file/bai_tap/product.txt");
        for (Product product : productsData){
            System.out.printf("|%16s|%20s|%20s|%20s|%20s|\n",product.getIdProduct(),product.getNameProduct(),product.getNameCompany(),product.getCost(),product.getDescription());
        }
    }
    public static void search(String name){
        boolean status = false;
        List<Product> productsData = readDataFromFile("src/ss17_doc_file_ghi_file/bai_tap/product.txt");
        for (Product product : productsData){
            if(name.equals(product.getNameProduct())){
                System.out.println(product);
                status =true;
            }
        }
        if(status==false){
            System.out.println("không có sán phẩm này");
        }
    }
    public static void main(String[] args) {
        System.out.println("Menu------------");
        int choice=0;
        do{
            System.out.println("1.\tAdd new product\n" +
                    "2.\tDisplay Product\n" +
                    "3.\tSearch Product\n" +
                    "4.\texits");
            System.out.println("mời chọn chức năng");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("nhập sai định dang, nhập lại");
            }
            switch (choice){
                case 1:
                    addProduct();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.println("nhập tên sản phẩm cần tìm :");
                    String name = sc.nextLine();
                    search(name);
                    break;
                case 4:
                    System.exit(0);
            }
        }while (true);

    }
}
