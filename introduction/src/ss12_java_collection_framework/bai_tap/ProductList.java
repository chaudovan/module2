package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductList {
    private ArrayList<Product> productList;

    public ProductList() {
        this.productList = new ArrayList<Product>();
    }

    public ProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }
    public void editProduct(int index,Product newProduct){
        this.productList.set(index,newProduct);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập tên sản phẩm mới");
//        String nameProduct = sc.nextLine();
//        System.out.println("Nhập giá sản phẩm mới");
//        double price = sc.nextDouble();
//        for (int i = 0; i <productList.size() ; i++) {
//            if(productList.get(i).getId()==id){
//                productList.get(i).setNameProduct(nameProduct);
//                productList.get(i).setPrice(price);
//                break;
//            }
//        }
//        for(Product product:productList){
//            String getId = product.getId();
//            if(getId==id){
//                System.out.println("nhập tên sản phẩm mới");
//                String nameProduct = sc.nextLine();
//                System.out.println("Nhập giá sản phẩm mới");
//                double price = sc.nextDouble();
//                product.setNameProduct(nameProduct);
//                product.setPrice(price);
//            }
//        }
//        if(index==0){
//            System.out.println("Mã sản phẩm không tồn tại");
//        }
    }
    public int checkID(String id){
        for (int i = 0; i <productList.size() ; i++) {
            if(id.equals(productList.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
    public void display(){
        for (Product products:productList) {
            System.out.println(products);
        }
    }
    public void removeProduct(int index){
        for (int i = 0; i <productList.size() ; i++) {
            if(i==index){
                productList.remove(i);
            }
        }
    }
    public void searchName(String name){
        for (Product product:productList) {
            if(product.getNameProduct().indexOf(name)>=0){
                System.out.println(product);
            }
        }
    }
    public void sort(){
        Collections.sort(this.productList, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if(product1.getPrice()>product2.getPrice()){
                    return 1;
                }
                return -1;
            }
        });
    }
}
