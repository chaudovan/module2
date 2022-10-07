package case_study.model.facility;

import java.util.Date;

public abstract class Facility {
    private String nameService;
    private double areaUse;
    private double cost;
    private int personMax;
    private Date rent;

    public Facility() {
    }

    public Facility(String nameService, double areaUse, double cost, int personMax, Date rent) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.cost = cost;
        this.personMax = personMax;
        this.rent = rent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getPersonMax() {
        return personMax;
    }

    public void setPersonMax(int personMax) {
        this.personMax = personMax;
    }

    public Date getRent() {
        return rent;
    }

    public void setRent(Date rent) {
        this.rent = rent;
    }
}
