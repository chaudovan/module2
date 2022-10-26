package case_study.services;

import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);
    private Map<Villa,Integer> villaArr = new LinkedHashMap<>();
    private Map<House,Integer> houseList = new LinkedHashMap<>();
    private Map<Room,Integer> roomList = new LinkedHashMap<>();
    private final String PATH_ROOM = "src/case_study/data/room.csv";
    private final String PATH_HOUSE = "src/case_study/data/house.csv";
    private final String PATH_VILLA = "src/case_study/data/villa.csv";
    @Override
    public void add() {
        int choice;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.println("nhập dịch vụ muốn thêm :");
            choice = Integer.parseInt(sc.nextLine());
        }while (choice<1 ||choice>4);
        switch (choice){
            case 1:
                System.out.println("villa new ");
                addNewVilla();
                break;
            case 2:
                System.out.println("house new ");
                addNewHouse();
                break;
            case 3:
                System.out.println("room new ");
                addNewRoom();
                break;
            case 4:
                break;
        }

    }

    @Override
    public void displayFacility(){
        System.out.println("VILLA LIST");
        for (int i = 0; i <149 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%20s|%20s|\n",
                "Tên dịch vụ","Diên tích","Chi phí","Số ngươi","Kiểu thuê","Tiêu chuẩn","Diện tích hồ bơi","Số tầng");
        for (int i = 0; i <149 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<Villa,Integer> villa: villaArr.entrySet()){
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%20s|%20s|\n",villa.getKey().getNameService(),villa.getKey().getAreaUse(),villa.getKey().getCost(),villa.getKey().getPersonMax(),villa.getKey().getRent(),villa.getKey().getRoomStandard(),villa.getKey().getAreaPool(),villa.getKey().getFloors());
        }
        System.out.println();
        System.out.println("HOUSE LIST");
        for (int i = 0; i <132 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%16s|%16s|%16s|%16s|%20s|%20s|%20s|\n",
                "Tên dịch vụ","Diên tích","Chi phí","Số ngươi","Kiểu thuê","Tiêu chuẩn","Số tầng");
        for (int i = 0; i <132 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<House,Integer> house: houseList.entrySet()){
            System.out.printf("|%16s|%16s|%16s|%16s|%20s|%20s|%20s|\n",house.getKey().getNameService(),house.getKey().getAreaUse(),house.getKey().getCost(),house.getKey().getPersonMax(),house.getKey().getRent(),house.getKey().getRoomStandard(),house.getKey().getFloors());
        }
        System.out.println();
        System.out.println("Room LIST");
        for (int i = 0; i <107 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|\n","Tên dịch vụ","Diên tích","Chi phí","Số ngươi","Kiểu thuê","Dịch vụ free");
        for (int i = 0; i <107 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<Room,Integer> room: roomList.entrySet()){
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|\n",room.getKey().getNameService(),room.getKey().getAreaUse(),room.getKey().getCost(),room.getKey().getPersonMax(),room.getKey().getRent(),room.getKey().getFreeService());
        }
        System.out.println();
    }

    @Override
    public void displayMainTenance() {

    }

    public void addNewVilla(){
        List<String[]> list = WriteFileReadFile.readToFile(PATH_VILLA);
        villaArr.clear();
        for(String[] item:list){
            Villa villa = new Villa(item[0],Double.parseDouble(item[1]),Double.parseDouble(item[2]),Integer.parseInt(item[3]),item[4],item[5],
                    Double.parseDouble(item[6]),Double.parseDouble(item[7]));
            int number = Integer.parseInt(item[8]);
            villaArr.put(villa,number);
        }
        System.out.println("nhập tên dịch vụ :");
        String nameService = sc.nextLine();
        System.out.println("nhập diện tích sử dụng :");
        double areaUse = Double.parseDouble(sc.nextLine());
        System.out.println("nhập chi phí thuê :");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số lượng người ở tối đa :");
        int personMax = Integer.parseInt(sc.nextLine());
        System.out.println("nhập kiểu thuê :");
        String rent = sc.nextLine();
        System.out.println("nhập tiêu chuẩn phòng :");
        String roomStandard = sc.nextLine();
        System.out.println("nhập diện tích hồ bơi :");
        double areaPool = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số tầng :");
        double floors = Double.parseDouble(sc.nextLine());
        Villa villa = new Villa(nameService,areaUse,cost,personMax,rent,roomStandard,areaPool,floors);
        villaArr.put(villa,0);
        String str = "";
        for (Map.Entry<Villa,Integer> item: villaArr.entrySet()){
            str += item.getKey().getNameService() + "," +item.getKey().getAreaUse() + "," +
                    item.getKey().getCost() + "," + item.getKey().getPersonMax() + "," +item.getKey().getRent() +"," +
                    item.getKey().getRoomStandard() + "," + item.getKey().getAreaPool() +"," +item.getKey().getFloors()
                    + "," +item.getValue();
        }
        WriteFileReadFile.writeToFile(PATH_VILLA,str);
        System.out.println("thêm thành công");
    }
    public void addNewHouse(){
        System.out.println("nhập tên dịch vụ :");
        String nameService = sc.nextLine();
        System.out.println("nhập diện tích sử dụng :");
        double areaUse = Double.parseDouble(sc.nextLine());
        System.out.println("nhập chi phí thuê :");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số lượng người ở tối đa :");
        int personMax = Integer.parseInt(sc.nextLine());
        System.out.println("nhập kiểu thuê :");
        String rent = sc.nextLine();
        System.out.println("nhập tiêu chuẩn phòng :");
        String roomStandard = sc.nextLine();
        System.out.println("nhập số tầng :");
        double floors = Double.parseDouble(sc.nextLine());
        House house = new House(nameService,areaUse,cost,personMax,rent,roomStandard,floors);
        houseList.put(house,0);
    }
    public void addNewRoom(){
        System.out.println("nhập tên dịch vụ :");
        String nameService = sc.nextLine();
        System.out.println("nhập diện tích sử dụng :");
        double areaUse = Double.parseDouble(sc.nextLine());
        System.out.println("nhập chi phí thuê :");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số lượng người ở tối đa :");
        int personMax = Integer.parseInt(sc.nextLine());
        System.out.println("nhập kiểu thuê :");
        String rent = sc.nextLine();
        String freeService="";
        int choice;
        do {
            System.out.println("dịch vụ free ");
            System.out.println("1.Coffe \t" +
                    "2.Water \t" +
                    "3.Breakfast \t");
            System.out.println("nhập dịch vụ free :");
            choice = Integer.parseInt(sc.nextLine());
        }while (choice<1 || choice>3);
        switch (choice){
            case 1:
                freeService = "Coffe";
                break;
            case 2:
                freeService = "Water";
                break;
            default:
                freeService = "Breakfast";
        }
        Room room = new Room(nameService,areaUse,cost,personMax,rent,freeService);
        roomList.put(room,0);
    }
}
