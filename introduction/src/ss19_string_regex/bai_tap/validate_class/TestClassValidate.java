package ss19_string_regex.bai_tap.validate_class;


public class TestClassValidate {
    private static ClassValidate classValidate= new ClassValidate();
    public static final String[] validateClass = {"C0318G","C0218G","C0319G","M0318G", "P0323A","X0318G"};
    public static void main(String[] args) {
        for (int i = 0; i <validateClass.length ; i++) {
            System.out.println("Class : " +validateClass[i] + "  " + classValidate.validate(validateClass[i]));
        }
    }
}
