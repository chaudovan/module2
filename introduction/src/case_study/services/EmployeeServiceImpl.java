package case_study.services;

import case_study.model.person.Employee;
import case_study.until.RegexData;

import javax.print.attribute.standard.NumberUp;
import java.awt.dnd.DropTarget;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList = new ArrayList();
    public static Scanner sc = new Scanner(System.in);
    final String PATH = "src/case_study/data/employee.csv";
    public static final String REGEX_AGE = "^(?:(1[0-2]|0?[1-9])/(3[01]|[12][0-9]|0?[1-9])|(3[01]|[12][0-9]|0?[1-9])/(1[0-2]|0?[1-9]))/(?:[0-9]{2})?[0-9]{2}$";

    @Override
    public void add() throws NumberFormatException {
        List<String[]> list = WriteFileReadFile.readToFile(PATH);
        employeeList.clear();

        for (String[] item : list) {
            Employee employee1 = new Employee(item[1], item[2], item[3], Integer.parseInt(item[4]),
                    Integer.parseInt(item[5]), item[6], item[0],
                    item[7], item[8], Double.parseDouble(item[9]));
            employeeList.add(employee1);
        }
        System.out.print("Nhập id : ");
        String id = sc.nextLine();
        System.out.println("nhập tên nhân viên");
        String name = sc.nextLine();
        System.out.print("Nhập năm sinh : ");
        String date = RegexData.regexAge(sc.nextLine(),REGEX_AGE);
        String gender;
        int num;
        do {
            System.out.println("Giói tính");
            System.out.println("1.Nam   hoặc   2. Nữ");
            System.out.print("Nhập giới tính : ");
            num = Integer.parseInt(sc.nextLine());
        } while (num < 1 || num > 2);
        if (num == 1) {
            gender = "nam";
        } else {
            gender = "nữ";
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

        System.out.println("nhập email : ");
        String email = sc.nextLine();
        String levels = "";
        int choice;
        do {
            System.out.println("Trình Độ");
            System.out.println("1.Trung cấp\t" +
                    "2.Cao đẳng\t" +
                    "3.Đại học\t" +
                    "4.Sau đại học\t");
            System.out.println("nhập trình độ : ");
            choice = Integer.parseInt(sc.nextLine());
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
            choice1 = Integer.parseInt(sc.nextLine());
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
        double income = 0;
        do {
            check=false;
            System.out.println("Lương của nhân viên :");
            try {
                income = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập sai dịnh dạng");
                check=true;
            }
        } while (income < 0 || check);
        Employee employee = new Employee(name, date, gender, numberIdentity, numberPhone, email, id, levels, location, income);
        employeeList.add(employee);
        String str = "";
        for (Employee item : employeeList) {
            str += item.getInFo() + "\n";
        }
        WriteFileReadFile.writeToFile(PATH, str);
        System.out.println("Thêm thành công");
        sc.nextLine();
    }

    @Override
    public void edit() {
        List<String[]> list = WriteFileReadFile.readToFile(PATH);
        employeeList.clear();

        for (String[] item : list) {
            Employee employee1 = new Employee(item[1], item[2], item[3], Integer.parseInt(item[4]),
                    Integer.parseInt(item[5]), item[6], item[0],
                    item[7], item[8], Double.parseDouble(item[9]));

            employeeList.add(employee1);
        }
        System.out.print("Nhập id nhân viên cần sửa : ");
        String id = sc.nextLine();
        int index = 0;
        boolean status = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getIdEmployee())) {
                status = true;
                index = i;
            }
        }
        if (status) {
            System.out.println("nhập tên nhân viên");
            String name = sc.nextLine();
            String date = RegexData.regexAge(sc.nextLine(),REGEX_AGE);
            String gender;
            int num;
            do {
                System.out.println("Giói tính");
                System.out.println("1.Nam   hoặc   2. Nữ");
                System.out.print("Nhập giới tính : ");
                num = Integer.parseInt(sc.nextLine());
            } while (num < 1 || num > 2);
            if (num == 1) {
                gender = "nam";
            } else {
                gender = "nữ";
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
                choice = Integer.parseInt(sc.nextLine());
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
                choice1 = Integer.parseInt(sc.nextLine());
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
            double income = 0;
            do {
                System.out.println("Lương của nhân viên :");
                try {
                    income = Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("nhập sai dịnh dạng");
                }
            } while (income < 0);
            Employee employee = new Employee(name, date, gender, numberIdentity, numberPhone, email, id, levels, location, income);
            employeeList.set(index, employee);
            String str = "";
            for (Employee item : employeeList) {
                str += item.getInFo() + "\n";
            }
            WriteFileReadFile.writeToFile(PATH, str);
            System.out.println("sửa thành công");
        } else {
            System.out.println("id không tồn tài");
        }
        sc.nextLine();
    }

    @Override
    public void display() {
        List<String[]> list = WriteFileReadFile.readToFile(PATH);
        employeeList.clear();

        for (String[] item : list) {
            Employee employee1 = new Employee(item[1], item[2], item[3], Integer.parseInt(item[4]),
                    Integer.parseInt(item[5]), item[6], item[0],
                    item[7], item[8], Double.parseDouble(item[9]));

            employeeList.add(employee1);
        }
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|\n", "ID", "Name", "BirthDay", "Gender", "CMND", "Phone", "Email", "Level", "Location", "Luong");
        for (int i = 0; i < 171; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Employee employee : employeeList) {
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|%16s|\n", employee.getIdEmployee(), employee.getName(), employee.getBirtthDay(), employee.getGender(), employee.getNumberIdentity(), employee.getNumberPhone(), employee.getEmail(), employee.getLevels(), employee.getLocation(), employee.getIncome());
        }
    }
}
