package case_study.model.person;

import java.util.Date;

public class Customer extends Person{
    private String idCustomer;
    private String guest;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birtthDay, String gender, int numberIdentity, int numberPhone, String email, String idCustomer, String guest, String address) {
        super(name, birtthDay, gender, numberIdentity, numberPhone, email);
        this.idCustomer = idCustomer;
        this.guest = guest;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getInFo(){
        return this.idCustomer + "," +this.getName() + "," + this.getBirtthDay() + "," + this.getGender() +"," + this.getNumberIdentity() + "," + this.getNumberPhone() + "," + this.getEmail() + "," + this.guest + "," + this.address;
    }
}
