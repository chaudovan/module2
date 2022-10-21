package ss19_string_regex.bai_tap.validate_numberphone;


public class TestValidatePhone {
    private static NumberPhone numberPhone = new NumberPhone();
    public static String[] phoneList = {"(84)-(0905773938)","(ok)-(090111102)","(84)-(0795515595)"};

    public static void main(String[] args) {
        for (int i = 0; i <phoneList.length ; i++) {
            System.out.println("Phone number is : " +phoneList[i]+ "  " +numberPhone.validate(phoneList[i]));
        }
    }
}
