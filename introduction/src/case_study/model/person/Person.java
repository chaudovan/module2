package case_study.model.person;

import java.util.Date;

public abstract class Person {
    private String name;
    private String birtthDay;
    private String gender;
    private int numberIdentity;
    private int numberPhone;
    private String email;

    public Person() {
    }

    public Person(String name, String birtthDay, String gender, int numberIdentity, int numberPhone, String email) {
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

    public String getBirtthDay() {
        return birtthDay;
    }

    public void setBirtthDay(String birtthDay) {
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

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birtthDay=" + birtthDay +
                ", gender='" + gender + '\'' +
                ", numberIdentity=" + numberIdentity +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
//    public String getInfo(){
//        return this.name + "," + this.birtthDay + "," + this.gender + "," + this.numberIdentity + "," + this.numberPhone + "," + this.email;
//    }
}
