package case_study.model.person;

import java.util.Date;

public abstract class Person {
    private String name;
    private Date birtthDay;
    private String gender;
    private int numberIdentity;
    private int numberPhone;
    private String email;

    public Person() {
    }

    public Person(String name, Date birtthDay, String gender, int numberIdentity, int numberPhone, String email) {
        this.name = name;
        this.birtthDay = birtthDay;
        this.gender = gender;
        this.numberIdentity = numberIdentity;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirtthDay() {
        return birtthDay;
    }

    public void setBirtthDay(Date birtthDay) {
        this.birtthDay = birtthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberIdentity() {
        return numberIdentity;
    }

    public void setNumberIdentity(int numberIdentity) {
        this.numberIdentity = numberIdentity;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
