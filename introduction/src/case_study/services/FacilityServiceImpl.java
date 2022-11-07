package case_study.services;

import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.until.RegexData;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);
    private Map<Villa, Integer> villaArr = new LinkedHashMap<>();
    private Map<House, Integer> houseList = new LinkedHashMap<>();
    private Map<Room, Integer> roomList = new LinkedHashMap<>();
    private final String PATH_ROOM = "src/case_study/data/room.csv";
    private final String PATH_HOUSE = "src/case_study/data/house.csv";
    private final String PATH_VILLA = "src/case_study/data/villa.csv";
    public static final String REGEX_STR = "^[A-Z][a-z]+";
    public static final String REGEX_VILLA = "^(SVVL)[-][\\d]{4}$";
    public static final String REGEX_HOUSE = "^(SVHO)[-][\\d]{4}$";
    public static final String REGEX_ROOM = "^(SVRO)[-][\\d]{4}$";
    public static final String REGEX_AREA = "^[3-9]\\d|[1-9]\\d{2,}$";
    public static final String REGEX_COST = "^[1-9]\\d{1,}$";
    public static final String REGEX_AMOUT = "^[1-9]|[1][1-9]$";

    private String inputId() {
        System.out.println("Nhập tên dịch vụ :");
        return RegexData.regexStr(sc.nextLine(), REGEX_STR, "nhập sai định dạng,tên phải viết hoa chữ cái đầu");
    }

    private String inputArea() {
        System.out.println("nhập diện tích sử dụng :");
        return RegexData.regexStr(sc.nextLine(), REGEX_AREA, "nhập sai định dạng,diện tích sử dụng phải lớn hơn 30");
    }

    private String inputArea1() {
        System.out.println("nhập diện tích hồ bơi :");
        return RegexData.regexStr(sc.nextLine(), REGEX_AREA, "nhập sai định dạng,diện tích hồ bơi phải lớn hơn 30");
    }

    private String inputCost() {
        System.out.println("nhập giá tiền :");
        return RegexData.regexStr(sc.nextLine(), REGEX_COST, "nhập sai định dạng,giá tiền phải là số dương");
    }

    private String inputFloors() {
        System.out.println("nhập số tầng :");
        return RegexData.regexStr(sc.nextLine(), REGEX_AMOUT, "nhập sai định dạng,số tàng phải là số dương");
    }

    private String inputPeople() {
        System.out.println("nhập số người tối da :");
        return RegexData.regexStr(sc.nextLine(), REGEX_AMOUT, "nhạp sai định dạng,số người lớn hơn 0 và nhỏ hơn 20");
    }

    @Override
    public void add() {
        int choice = 0;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.println("nhập dịch vụ muốn thêm :");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng");
            }
        } while (choice < 1 || choice > 4);
        switch (choice) {
            case 1:
                System.out.println("villa new ");
                addNewVilla();
                add();
                break;
            case 2:
                System.out.println("house new ");
                addNewHouse();
                add();
                break;
            case 3:
                System.out.println("room new ");
                addNewRoom();
                add();
                break;
            case 4:
                break;
        }

    }

    @Override
    public void displayFacility() {
        System.out.println("VILLA LIST");
        for (int i = 0; i < 149; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%20s|%20s|\n",
                "Tên dịch vụ", "Diên tích", "Chi phí", "Số ngươi", "Kiểu thuê", "Tiêu chuẩn", "Diện tích hồ bơi", "Số tầng");
        for (int i = 0; i < 149; i++) {
            System.out.print("-");
        }
        System.out.println();
        List<String[]> list_villa = WriteFileReadFile.readToFile(PATH_VILLA);
        villaArr.clear();
        for (String[] item : list_villa) {
            Villa villa = new Villa(item[0], Double.parseDouble(item[1]), Double.parseDouble(item[2]), Integer.parseInt(item[3]), item[4], item[5],
                    Double.parseDouble(item[6]), Double.parseDouble(item[7]));
            int number = Integer.parseInt(item[8]);
            villaArr.put(villa, number);
        }
        for (Map.Entry<Villa, Integer> villa : villaArr.entrySet()) {
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%20s|%20s|\n", villa.getKey().getNameService(), villa.getKey().getAreaUse(), villa.getKey().getCost(), villa.getKey().getPersonMax(), villa.getKey().getRent(), villa.getKey().getRoomStandard(), villa.getKey().getAreaPool(), villa.getKey().getFloors());
        }
        System.out.println();
        System.out.println("HOUSE LIST");
        for (int i = 0; i < 132; i++) {
            System.out.print("-");
        }
        System.out.println();
        List<String[]> list_house = WriteFileReadFile.readToFile(PATH_HOUSE);
        houseList.clear();
        for (String[] item : list_house) {
            House house = new House(item[0], Double.parseDouble(item[1]), Double.parseDouble(item[2]), Integer.parseInt(item[3]), item[4],
                    item[5], Double.parseDouble(item[6]));
            int number = Integer.parseInt(item[7]);
            houseList.put(house, number);
        }
        System.out.printf("|%16s|%16s|%16s|%16s|%20s|%20s|%20s|\n",
                "Tên dịch vụ", "Diên tích", "Chi phí", "Số ngươi", "Kiểu thuê", "Tiêu chuẩn", "Số tầng");
        for (int i = 0; i < 132; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<House, Integer> house : houseList.entrySet()) {
            System.out.printf("|%16s|%16s|%16s|%16s|%20s|%20s|%20s|\n", house.getKey().getNameService(), house.getKey().getAreaUse(), house.getKey().getCost(), house.getKey().getPersonMax(), house.getKey().getRent(), house.getKey().getRoomStandard(), house.getKey().getFloors());
        }
        System.out.println();
        System.out.println("Room LIST");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println();
        List<String[]> list_room = WriteFileReadFile.readToFile(PATH_ROOM);
        roomList.clear();
        for (String[] item : list_room) {
            Room room = new Room(item[0], Double.parseDouble(item[1]), Double.parseDouble(item[2]), Integer.parseInt(item[3]), item[4],
                    item[5]);
            int number = Integer.parseInt(item[6]);
            roomList.put(room, number);
        }
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|\n", "Tên dịch vụ", "Diên tích", "Chi phí", "Số ngươi", "Kiểu thuê", "Dịch vụ free");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<Room, Integer> room : roomList.entrySet()) {
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|\n", room.getKey().getNameService(), room.getKey().getAreaUse(), room.getKey().getCost(), room.getKey().getPersonMax(), room.getKey().getRent(), room.getKey().getFreeService());
        }
        System.out.println();
    }

    @Override
    public void displayMainTenance() {

    }

    public void addNewVilla() {
        List<String[]> list = WriteFileReadFile.readToFile(PATH_VILLA);
        villaArr.clear();
        for (String[] item : list) {
            Villa villa = new Villa(item[0], Double.parseDouble(item[1]), Double.parseDouble(item[2]), Integer.parseInt(item[3]), item[4], item[5],
                    Double.parseDouble(item[6]), Double.parseDouble(item[7]));
            int number = Integer.parseInt(item[8]);
            villaArr.put(villa, number);
        }
        String nameService = inputId();
        double areaUse = 0;
        double cost = 0;
        double areaPool = 0;
        double floors = 0;
        int personMax = 0;
        areaUse = Double.parseDouble(inputArea());
        cost = Double.parseDouble(inputCost());
        personMax = Integer.parseInt(inputPeople());
        System.out.println("nhập kiểu thuê :");
        String rent = sc.nextLine();
        System.out.println("nhập tiêu chuẩn phòng :");
        String roomStandard = sc.nextLine();

        areaPool = Double.parseDouble(inputArea1());

        floors = Double.parseDouble(inputFloors());

        Villa villa = new Villa(nameService, areaUse, cost, personMax, rent, roomStandard, areaPool, floors);
        villaArr.put(villa, 0);
        String str = "";
        for (Map.Entry<Villa, Integer> item : villaArr.entrySet()) {
            str += item.getKey().getNameService() + "," + item.getKey().getAreaUse() + "," +
                    item.getKey().getCost() + "," + item.getKey().getPersonMax() + "," + item.getKey().getRent() + "," +
                    item.getKey().getRoomStandard() + "," + item.getKey().getAreaPool() + "," + item.getKey().getFloors()
                    + "," + item.getValue() + "\n";
        }
        WriteFileReadFile.writeToFile(PATH_VILLA, str);
        System.out.println("thêm thành công");
    }

    public void addNewHouse() {
        List<String[]> list = WriteFileReadFile.readToFile(PATH_HOUSE);
        houseList.clear();
        for (String[] item : list) {
            House house = new House(item[0], Double.parseDouble(item[1]), Double.parseDouble(item[2]), Integer.parseInt(item[3]), item[4],
                    item[5], Double.parseDouble(item[6]));
            int number = Integer.parseInt(item[7]);
            houseList.put(house, number);
        }
        String nameService = inputId();
        double areaUse = 0;
        double cost = 0;
        double floors = 0;
        int personMax = 0;
        areaUse = Double.parseDouble(inputArea());
        cost = Double.parseDouble(inputCost());
        personMax = Integer.parseInt(inputPeople());
        System.out.println("nhập kiểu thuê :");
        String rent = sc.nextLine();
        System.out.println("nhập tiêu chuẩn phòng :");
        String roomStandard = sc.nextLine();
        floors = Double.parseDouble(inputFloors());
        House house = new House(nameService, areaUse, cost, personMax, rent, roomStandard, floors);
        houseList.put(house, 0);
        String str = "";
        for (Map.Entry<House, Integer> item : houseList.entrySet()) {
            str += item.getKey().getNameService() + "," + item.getKey().getAreaUse() + "," +
                    item.getKey().getCost() + "," + item.getKey().getPersonMax() + "," + item.getKey().getRent() + "," +
                    item.getKey().getRoomStandard() + "," + item.getKey().getFloors()
                    + "," + item.getValue();
        }
        WriteFileReadFile.writeToFile(PATH_HOUSE, str);
        System.out.println("thêm thành công");
    }

    public void addNewRoom() {
        List<String[]> list = WriteFileReadFile.readToFile(PATH_ROOM);
        roomList.clear();
        for (String[] item : list) {
            Room room = new Room(item[0], Double.parseDouble(item[1]), Double.parseDouble(item[2]), Integer.parseInt(item[3]), item[4],
                    item[5]);
            int number = Integer.parseInt(item[6]);
            roomList.put(room, number);
        }
        String nameService = inputId();
        double areaUse = 0;
        double cost = 0;
        int personMax = 0;
        areaUse = Double.parseDouble(inputArea());
        cost = Double.parseDouble(inputCost());
        personMax = Integer.parseInt(inputPeople());
        System.out.println("nhập kiểu thuê :");
        String rent = sc.nextLine();
        String freeService = "";
        int choice;
        do {
            System.out.println("dịch vụ free ");
            System.out.println("1.Coffe \t" +
                    "2.Water \t" +
                    "3.Breakfast \t");
            System.out.println("nhập dịch vụ free :");
            choice = Integer.parseInt(sc.nextLine());
        } while (choice < 1 || choice > 3);
        switch (choice) {
            case 1:
                freeService = "Coffe";
                break;
            case 2:
                freeService = "Water";
                break;
            default:
                freeService = "Breakfast";
        }
        Room room = new Room(nameService, areaUse, cost, personMax, rent, freeService);
        roomList.put(room, 0);
        String str = "";
        for (Map.Entry<Room, Integer> item : roomList.entrySet()) {
            str += item.getKey().getNameService() + "," + item.getKey().getAreaUse() + "," +
                    item.getKey().getCost() + "," + item.getKey().getPersonMax() + "," + item.getKey().getRent() + "," +
                    item.getKey().getFreeService() + "," + item.getValue();
        }
        WriteFileReadFile.writeToFile(PATH_ROOM, str);
        System.out.println("thêm thành công");
    }
}
