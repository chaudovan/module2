package case_study.services;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    List<Customer> customerLinkedList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    final String PATH = "src/case_study/data/customer.csv";
    @Override
    public void add() {
        List<String[]> list =WriteFileReadFile.readToFile(PATH);
        customerLinkedList.clear();

        for (String[] item : list) {
            Customer customer = new Customer(item[1], item[2], item[3], Integer.parseInt(item[4]),
                    Integer.parseInt(item[5]), item[6], item[0], item[7], item[8]);
            customerLinkedList.add(customer);
        }
        System.out.print("nhập mã khách hàng : ");
        String id = sc.nextLine();
        System.out.print("Nhập tên khách hàng : ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh : ");
        String date = sc.nextLine();
        String gender;
        int num;
        do {
            System.out.println("Giói tính");
            System.out.println("1.Nam   hoặc   2. Nữ");
            System.out.print("Nhập giới tính : ");
            num = Integer.parseInt(sc.nextLine());
        }while (num<1 || num>2);
        if(num==1){
            gender = "nam";
        }else{
            gender ="nữ";
        }
        int numberIdentity = 0;
        int numberPhone = 0;
        boolean check;
        do {
            check=false;
            try {
                System.out.println("nhập số CMND : ");
                numberIdentity = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhạp sai định dạng");
                check=true;
            }
        }while (check);
        do {
            check=false;
            System.out.println("Nhập số điện thoại : ");
            try {
                numberPhone = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập sai dịnh dạng");
                check =true;
            }
        }while (check);
        System.out.print("Nhập email : ");
        String email = sc.nextLine();
        String typeGuest="";
        int choice;
        do{
            System.out.println("Phân Loại khách hàng");
            System.out.println("1.Diamond\t2.Platinium\t3.Gold\t4.Silver\t5.Member");
            System.out.print("Mời chọn loại khách hàng : ");
            choice = Integer.parseInt(sc.nextLine());
        }while (choice<1 || choice>5);
        switch (choice){
            case 1:
                typeGuest = "Diamond";
                break;
            case 2:
                typeGuest = "Platinium";
                break;
            case 3:
                typeGuest = "Gold";
                break;
            case 4:
                typeGuest = "Silver";
                break;
            case 5:
                typeGuest = "Member";
                break;
        }
        System.out.print("Nhập địa chỉ : ");
        String address = sc.nextLine();
        Customer customer = new Customer(name,date,gender,numberIdentity,numberPhone,email,id,typeGuest,address);
        customerLinkedList.add(customer);
        String str = "";
        for (Customer item : customerLinkedList) {
            str += item.getInFo() + "\n";
        }
        WriteFileReadFile.writeToFile(PATH, str);
        System.out.println("thêm thành công");
    }

    @Override
    public void edit() {
        List<String[]> list =WriteFileReadFile.readToFile(PATH);
        customerLinkedList.clear();

        for (String[] item : list) {
            Customer customer = new Customer(item[1], item[2], item[3], Integer.parseInt(item[4]),
                    Integer.parseInt(item[5]), item[6], item[0], item[7], item[8]);
            customerLinkedList.add(customer);
        }
        System.out.println("Nhập id khách cần chỉnh sửa : ");
        String id = sc.nextLine();
        int index = 0;
        boolean status = false;
        for (int i = 0; i <customerLinkedList.size() ; i++) {
            if(id.equals(customerLinkedList.get(i).getIdCustomer())){
                status = true;
                index=i;
                break;
            }
        }
        if(status){
            System.out.print("Nhập tên khách hàng : ");
            String name = sc.nextLine();
            System.out.print("Nhập ngày sinh : ");
            String date = sc.nextLine();
            String gender;
            int num;
            do {
                System.out.println("Giói tính");
                System.out.println("1.Nam   hoặc   2. Nữ");
                System.out.print("Nhập giới tính :");
                num = Integer.parseInt(sc.nextLine());
            }while (num<1 || num>2);
            if(num==1){
                gender ="nam";
            }else{
                gender ="nữ";
            }
            int numberIdentity = 0;
            int numberPhone = 0;
            boolean check;
            do {
                check=false;
                try {
                    System.out.println("nhập số CMND : ");
                    numberIdentity = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("nhạp sai định dạng");
                    check=true;
                }
            }while (check);
            do {
                check=false;
                System.out.println("Nhập số điện thoại : ");
                try {
                    numberPhone = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("nhập sai dịnh dạng");
                    check =true;
                }
            }while (check);
            System.out.print("Nhập email : ");
            String email = sc.nextLine();
            String typeGuest="";
            int choice=0;
            do{
                System.out.println("Phân Loại khách hàng");
                System.out.println("1.Diamond\t2.Platinium\t3.Gold\t4.Silver\t5.Member");
                System.out.print("Mời chọn loại khách hàng : ");
                choice = Integer.parseInt(sc.nextLine());
            }while (choice<0 || choice>5);
            switch (choice){
                case 1:
                    typeGuest = "Diamond";
                    break;
                case 2:
                    typeGuest = "Platinium";
                    break;
                case 3:
                    typeGuest = "Gold";
                    break;
                case 4:
                    typeGuest = "Silver";
                    break;
                case 5:
                    typeGuest = "Member";
                    break;
            }
            System.out.print("Nhập địa chỉ : ");
            String address = sc.nextLine();
            Customer customer = new Customer(name,date,gender,numberIdentity,numberPhone,email,id,typeGuest,address);
            customerLinkedList.set(index,customer);
            String str = "";
            for (Customer item : customerLinkedList) {
                str += item.getInFo() + "\n";
            }
            WriteFileReadFile.writeToFile(PATH, str);
            System.out.println("sửa ok");
        }else {
            System.out.println("id khách hàng không tồn tại");
        }
    }

    @Override
    public void display() {
        List<String[]> list =WriteFileReadFile.readToFile(PATH);
        customerLinkedList.clear();

        for (String[] item : list) {
            Customer customer = new Customer(item[1], item[2], item[3], Integer.parseInt(item[4]),
                    Integer.parseInt(item[5]), item[6], item[0], item[7], item[8]);
            customerLinkedList.add(customer);
        }
        for (int i = 0; i <154 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%8s|%16s|%16s|%16s|%16s|%16s|%20s|%16s|%20s|\n","ID","Họ và tên","Ngày sinh","Giới tính","Số CMND","Số điện thoại","Email","Loại khách hàng","Địa chỉ");
        for (int i = 0; i <154 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        for(Customer customer:customerLinkedList){
            System.out.printf("|%8s|%16s|%16s|%16s|%16s|%16s|%20s|%16s|%20s|\n",customer.getIdCustomer(),customer.getName(),customer.getBirtthDay(),customer.getGender(),customer.getNumberIdentity(),customer.getNumberPhone(),customer.getEmail(),customer.getGuest(),customer.getAddress());
        }
    }
}
