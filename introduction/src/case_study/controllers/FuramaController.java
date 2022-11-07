package case_study.controllers;

import case_study.model.person.Employee;
import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;
import case_study.services.FacilityServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class FuramaController {
    public static EmployeeServiceImpl list = new EmployeeServiceImpl();
    public static CustomerServiceImpl customerList = new CustomerServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static void main(String[] args) {
        displayMainMenu();


    }
    public static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu() {
        int choice=0;
        do {
            System.out.println("Menu-------------");
            System.out.println("" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("Mời chọn Chức năng : ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("nhập sai định dạng , mời nhập lại");
            }
            switch (choice) {
                case 1:
                    System.out.print("1.\tEmployee Management");
                    System.out.println();
                    employeeManager();
                    break;
                case 2:
                    System.out.print("2.\tCustomer Management\n");
                    System.out.println();
                    customerManager();
                    break;
                case 3:
                    System.out.print("3.\tFacility Management \n");
                    System.out.println();
                    facilityManager();
                    break;
                case 4:
                    System.out.print("4.\tBooking Management\n");
                    System.out.println();
                    bookingManager();
                    break;
                case 5:
                    System.out.print("5.\tPromotion Management\n");
                    System.out.println();
                    promotionManager();
                    break;
                case 6:
                    System.out.println("6.\tExit");
                    System.exit(0);
                default:
                    System.err.println("Nhập từ 1-6 ok");
            }
        } while (true);
    }
    public static void employeeManager(){
        int choice = 0;
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            System.out.println("Mời chọn Chức năng : ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng , mời nhập lại");
            }
            switch (choice) {
                case 1:
                    System.out.println("1\tDisplay list employees\n");
                    list.display();
                    employeeManager();
                    break;
                case 2:
                    System.out.println("2\tAdd new employee\n");
                    list.add();
                    employeeManager();
                    break;
                case 3:
                    System.out.println("3\tEdit employee\n");
                    list.edit();
                    employeeManager();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("nhập tư 1 - 4");
            }
        }while (true);
    }
    public static void customerManager(){
        int choice = 0;
        do {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            System.out.println("Mời chọn Chức năng : ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng , mời nhập lại");
            }
            switch (choice) {
                case 1:
                    System.out.println("1.\tDisplay list customers\n");
                    customerList.display();
                    customerManager();
                    break;
                case 2:
                    System.out.println("2.\tAdd new customer\n");
                    customerList.add();
                    customerManager();
                    break;
                case 3:
                    System.out.println("3.\tEdit customer\n");
                    customerList.edit();
                    customerManager();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("nhập tư 1 - 4");
            }
        }while (true);
    }
    public static void facilityManager(){
        int choice = 0;
        do {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            System.out.println("Mời chọn Chức năng : ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng , mời nhập lại");
            }
            switch (choice) {
                case 1:
                    System.out.println("1\tDisplay list facility\n");
                    facilityService.displayFacility();
                    facilityManager();
                    break;
                case 2:
                    System.out.println("2\tAdd new facility\n");
                    facilityService.add();
                    facilityManager();
                    break;
                case 3:
                    System.out.println("3\tDisplay list facility maintenance\n");
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("nhập tư 1 - 4");
            }
        }while (true);
    }
    public static void bookingManager(){
        int choice = 0;
        do {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            System.out.println("Mời chọn Chức năng : ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng , mời nhập lại");
            }
            switch (choice) {
                case 1:
                    System.out.println("1.\tAdd new booking\n");
                    break;
                case 2:
                    System.out.println("2.\tDisplay list booking\n");
                    break;
                case 3:
                    System.out.println("3.\tCreate new constracts\n");
                    break;
                case 4:
                    System.out.println("4.\tDisplay list contracts\n");
                    break;
                case 5:
                    System.out.println("5.\tEdit contracts\n");
                    break;
                case 6:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("nhập tư 1 - 6");
            }
        }while (true);
    }
    public static void promotionManager() {
        int choice = 0;
        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            System.out.println("Mời chọn Chức năng : ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng , mời nhập lại");
            }
            switch (choice) {
                case 1:
                    System.out.println("1.\tDisplay list customers use service\n");
                    break;
                case 2:
                    System.out.println("2.\tDisplay list customers get voucher\n");
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("nhập tư 1 - 3");
            }
        }while (true);
    }
}
