package ss17_doc_file_ghi_file.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private String idProduct;
    private String nameProduct;
    private String nameCompany;
    private double cost;
    private String description;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, String nameCompany, double cost, String description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.nameCompany = nameCompany;
        this.cost = cost;
        this.description = description;
    }

    public Product(String str) {
        String[] product = str.split(",");
        this.idProduct = product[0];
        this.nameProduct = product[1];
        this.nameCompany = product[2];
        this.cost = Double.parseDouble(product[3]);
        this.description = product[4];
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }
    public String getInFor(){
        return this.idProduct + "," + this.nameProduct + "," + this.nameCompany + "," + this.cost + "," + this.description;
    }
}
