package case_study.model.facility;

import java.util.Date;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String nameService, double areaUse, double cost, int personMax, String rent, String freeService) {
        super(nameService, areaUse, cost, personMax, rent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
