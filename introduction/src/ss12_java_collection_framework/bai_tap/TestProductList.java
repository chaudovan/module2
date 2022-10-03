package ss12_java_collection_framework.bai_tap;

import javax.swing.*;
import java.util.Scanner;

public class TestProductList {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        Scanner sc = new Scanner(System.in);
        int option=0;
        do {
            System.out.println("Menu-------");
            System.out.println(
                            "1. Thêm sản phẩm \n" +
                            "2. Sửa thông tin sản phẩm theo id\n" +
                            "3. Xoá sản phẩm theo id \n" +
                            "4. Hiển thị danh sách sản phẩm\n" +
                            "5. Tìm kiếm sản phẩm theo tên\n" +
                            "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                            "0. Thoát"
            );
            System.out.println("vui lòng chọn chực năng: ");
            option = sc.nextInt();
            sc.nextLine();
            if(option==1){
                System.out.println("nhập mã sẩn phẩm :");
                String id = sc.nextLine();

                System.out.println("nhập tên sản phẩm : ");
                String nameProduct = sc.nextLine();
                System.out.println("nhập giá sản phẩm: ");
                double price = sc.nextDouble();
                Product product = new Product(id,nameProduct,price);
                productList.addProduct(product);
            }else if(option==2){
                System.out.println("nhập mã ID cần sửa: ");
                String id = sc.nextLine();
                if(productList.checkID(id)!=-1){
                    System.out.println("nhập tên sản phẩm mới");
                    String nameProduct = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm mới");
                    double price = sc.nextDouble();
                    Product newProduct = new Product(id,nameProduct,price);
                    productList.editProduct(productList.checkID(id),newProduct);
                }else{
                    System.out.println("không tồn tại ID Trên");
                }
            }else if(option==3) {
                System.out.println("nhập mã ID cần xóa: ");
                String id = sc.nextLine();
                int index = productList.checkID(id);
                if(index!=-1){
                    productList.removeProduct(index);
                }else {
                    System.out.println("mã ID không tồn tại");
                }
            }else if(option==4){
                    productList.display();
            }else if(option==5){
                System.out.println("nhập tên sản phẩm cần tìm : ");
                String name = sc.nextLine();
                productList.searchName(name);
            }else if(option==6){
                productList.sort();
                productList.display();
            }
        }while (option!=0);
    }

}
