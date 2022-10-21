package case_study.model.facility;

import java.util.Date;

public class Villa extends Facility{
    private String roomStandard;
    private double areaPool;
    private double floors;

    public Villa() {
    }

    public Villa(String nameService, double areaUse, double cost, int personMax, String rent, String roomStandard, double areaPool, double floors) {
        super(nameService, areaUse, cost, personMax, rent);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public double getFloors() {
        return floors;
    }

    public void setFloors(double floors) {
        this.floors = floors;
    }
}
