package case_study.model.facility;

import java.util.Date;

public class House extends Facility{
    private String roomStandard;
    private double floors;

    public House() {
    }

    public House(String nameService, double areaUse, double cost, int personMax, String rent, String roomStandard, double floors) {
        super(nameService, areaUse, cost, personMax, rent);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getFloors() {
        return floors;
    }

    public void setFloors(double floors) {
        this.floors = floors;
    }
}
