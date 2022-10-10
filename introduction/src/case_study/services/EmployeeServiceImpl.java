package case_study.services;

import case_study.model.person.Employee;

import java.awt.dnd.DropTarget;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private ArrayList<Employee> list = new ArrayList();
    public static Scanner sc = new Scanner(System.in);
    @Override
    public void add() {
        System.out.print("Nhập id : ");
        String id = sc.nextLine();
        System.out.println("nhập tên nhân viên");
        String name = sc.nextLine();
        System.out.print("Nhập năm sinh : ");
        double date = sc.nextDouble();
        String gender;
        int num;
        do {
            System.out.println("Giói tính");
            System.out.println("1.Nam   hoặc   2. Nữ");
            System.out.print("Nhập giới tính : ");
            num = sc.nextInt();
        }while (num<1 || num>2);
        if(num==1){
            gender = "nam";
        }else{
            gender ="nữ";
        }
        System.out.println("nhập số CMND : ");
        int numberIdentity = sc.nextInt();
        System.out.println("Nhập số điện thoại : ");
        int numberPhone = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập email : ");
        String email = sc.nextLine();
        String levels="";
        int choice;
        do {
            System.out.println("Trình Độ");
            System.out.println("1.Trung cấp\t" +
                    "2.Cao đẳng\t" +
                    "3.Đại học\t" +
                    "4.Sau đại học\t");
            System.out.println("nhập trình độ : ");
            choice = sc.nextInt();
        }while (choice<1 || choice>4);
        switch (choice){
            case 1:
                levels += "Trung cấp";
                break;
            case 2:
                levels += "Cao đẳng";
                break;
            case 3:
                levels += "Đại học";
                break;
            case 4:
                levels += "Sau đại học";
        }
        String location="";
        int choice1;
        do {
            System.out.println("Vị trí");
            System.out.println("1.Lế tân\t" +
                    "2.Phục vụ\t" +
                    "3.Chuyên viên\t" +
                    "4.Giăm sát\t" +
                    "5.Quản lý\t" +
                    "6.Giám đốc\t");
            System.out.println("nhập vị trí : ");
            choice1 = sc.nextInt();
        }while (choice1<1 || choice1>6);
        switch (choice1){
            case 1:
                location = "Lế tân";
                break;
            case 2:
                location = "Phục vụ";
                break;
            case 3:
                location = "Chuyên viên";
                break;
            case 4:
                location = "Giăm sát";
                break;
            case 5:
                location = "Quản lý";
                break;
            case 6:
                location = "Giám đốc";
        }
        double income;
        do {
            System.out.println("Lương của nhân viên :");
            income = sc.nextDouble();
        }while (income<0);
        Employee employee = new Employee(name,date,gender,numberIdentity,numberPhone,email,id,levels,location,income);
        list.add(employee);
        sc.nextLine();
    }

    @Override
    public void edit() {
        System.out.print("Nhập id nhân viên cần sửa : ");
        String id = sc.nextLine();
        int index=0;
        boolean status = false;
        for (int i = 0; i <list.size() ; i++) {
            if(id.equals(list.get(i).getIdEmployee())){
                status = true;
                index=i;
            }
        }
        if(status) {
            System.out.println("nhập tên nhân viên");
            String name = sc.nextLine();
            System.out.print("Nhập năm sinh : ");
            double date = sc.nextDouble();
            String gender;
            int num;
            do {
                System.out.println("Giói tính");
                System.out.println("1.Nam   hoặc   2. Nữ");
                System.out.print("Nhập giới tính : ");
                num = sc.nextInt();
            } while (num < 1 || num > 2);
            if (num == 1) {
                gender = "nam";
            } else {
                gender = "nữ";
            }
            System.out.println("nhập số CMND : ");
            int numberIdentity = sc.nextInt();
            System.out.println("Nhập số điện thoại : ");
            int numberPhone = sc.nextInt();
            sc.nextLine();
            System.out.println("nhập email : ");
            String email = sc.nextLine();
            String levels = "";
            int choice;
            do {
                System.out.println("Trình Độ\t");
                System.out.println("1.Trung cấp\t" +
                        "2.Cao đẳng\t" +
                        "3.Đại học\t" +
                        "4.Sau đại học\t");
                System.out.println("nhập trình độ : ");
                choice = sc.nextInt();
            } while (choice < 1 || choice > 4);
            switch (choice) {
                case 1:
                    levels += "Trung cấp";
                    break;
                case 2:
                    levels += "Cao đẳng";
                    break;
                case 3:
                    levels += "Đại học";
                    break;
                case 4:
                    levels += "Sau đại học";
            }
            String location = "";
            int choice1;
            do {
                System.out.println("Vị trí");
                System.out.println("1.Lế tân\t" +
                        "2.Phục vụ\t" +
                        "3.Chuyên viên\t" +
                        "4.Giăm sát\t" +
                        "5.Quản lý\t" +
                        "6.Giám đốc\t");
                System.out.println("nhập vị trí : ");
                choice1 = sc.nextInt();
            } while (choice1 < 1 || choice1 > 6);
            switch (choice1) {
                case 1:
                    location = "Lế tân";
                    break;
                case 2:
                    location = "Phục vụ";
                    break;
                case 3:
                    location = "Chuyên viên";
                    break;
                case 4:
                    location = "Giăm sát";
                    break;
                case 5:
                    location = "Quản lý";
                    break;
                case 6:
                    location = "Giám đốc";
            }
            double income;
            do {
                System.out.println("Lương của nhân viên :");
                income = sc.nextDouble();
            } while (income < 0);
            Employee employee = new Employee(name,date,gender,numberIdentity,numberPhone,email,id,levels,location,income);
            list.set(index,employee);
            System.out.println("sửa thành công");
        }else{
            System.out.println("id không tồn tài");
        }
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|\n","ID","Name","BirthDay","Gender","CMND","Phone","Email","Level","Location","Luong");
        for (int i = 0; i <171; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Employee employee:list){
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|\n",employee.getIdEmployee(),employee.getName(),employee.getBirtthDay(),employee.getGender(),employee.getNumberIdentity(),employee.getNumberPhone(),employee.getEmail(),employee.getLevels(),employee.getLocation(),employee.getIncome());
        }
    }
}
