package case_study.model.person;

import java.util.Date;

public class Employee extends Person{
    private String idEmployee;
    private String levels;
    private String location;
    private double income;

    public Employee() {
    }

    public Employee(String name, double birtthDay, String gender, int numberIdentity, int numberPhone, String email, String idEmployee, String levels, String location, double income) {
        super(name, birtthDay, gender, numberIdentity, numberPhone, email);
        this.idEmployee = idEmployee;
        this.levels = levels;
        this.location = location;
        this.income = income;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString() +
                "idEmployee='" + idEmployee + '\'' +
                ", levels='" + levels + '\'' +
                ", location='" + location + '\'' +
                ", income=" + income +
                '}';
    }
}
