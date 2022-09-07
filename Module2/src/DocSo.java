import java.util.Scanner;
public class DocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần đọc (0-999): ");
        int num = sc.nextInt();
        while (num<0 || num>999){
            System.out.println("không hợp lệ!");
            System.out.print("nhập số cần đọc (0-999): ");
            num = sc.nextInt();
        }
        String input = String.valueOf(num);
//            while (!(input.matches("^[0-9][0-9]?[0-9]$") ||
//                    input.matches("^[0-9]$"))) {
//                System.out.println("không hợp lệ!");
//                System.out.print("nhập số cần đọc (0-999): ");
//                input = sc.nextLine();
//            }
        String[] inputRay = input.split("");
        switch (inputRay.length) {
            case 1:
                if (inputRay[0].equals("0")) {
                    System.out.println("zero");
                } else {
                    System.out.println(tenDown(inputRay[0]));
                }
                break;
            case 2:
                System.out.println(tenUp(inputRay[0], tenDown(inputRay[1])));
                break;
            case 3:
                if((inputRay[0].equals("0"))){
                    System.out.println(tenUp(inputRay[1], tenDown(inputRay[2])));
                }else if ((inputRay[1].equals("0")) && (inputRay[2].equals("0"))) {
                    System.out.println(hunredUp(inputRay[0]));
                } else {
                    System.out.print(hunredUp(inputRay[0]));
                    System.out.print(" and "+tenUp(inputRay[1], tenDown(inputRay[2])) + "\n");
                }
        }
    }

    private static String tenDown(String number) {
        switch (number) {
            case "0":
                return "";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            default:
                return "can't read this";
        }
    }

    private static String tenUp(String number, String previous) {
        switch (number) {
            case "0":
                return previous;
            case "1":
                switch (previous) {
                    case "":
                        return "ten";
                    case "one":
                        return "eleven";
                    case "two":
                        return "twelve";
                    case "three":
                        return "thirdteen";
                    case "five":
                        return "fifteen";
                    default:
                        return previous + "teen";
                }
            case "2":
                return "twenty " + previous;
            case "3":
                return "thirdty " + previous;
            case "4":
                return "forty " + previous;
            case "5":
                return "fifty " + previous;
            default:
                return tenDown(number) + "ty" + " " + previous;

        }
    }

    private static String hunredUp(String number) {
        return tenDown(number) + " hunred";
    }

}
