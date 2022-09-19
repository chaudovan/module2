package ss7_abstract_interface.thuc_hanh.bai1;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: chip-chip";
    }
    public String howtoEat(){
        return "I ate it";
    }
}
