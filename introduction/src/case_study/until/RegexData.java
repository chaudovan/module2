package case_study.until;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    public static Scanner sc = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = sc.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    try {
                        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate age = LocalDate.parse(temp, dateTimeFormatter);
                        LocalDate now = LocalDate.now();
                        int current = Period.between(age, now).getYears();
                        if (current < 100 && current > 18) {
                            check = false;
                        } else {
                            throw new AgeException("Só tuổi phải lớn hơn 18 và bé hơn 100");
                        }
                    } catch (DateTimeParseException e) {
                        System.out.println("nhập sai định dạng mm/dd/yyyy");
                        temp = sc.nextLine();
                    }
                } else {
                    throw new AgeException("nhập sai định dạng ");
                }
            }catch (AgeException e){
                System.out.println(e.getMessage());
                temp = sc.nextLine();
            }
        }
        return temp;
    }
}
