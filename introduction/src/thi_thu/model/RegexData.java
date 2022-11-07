package thi_thu.model;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    public static Scanner sc = new Scanner(System.in);
    public static String regex(String temp, String regex, String error) {
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

    public static Date validateDate(String dateAsString) throws AgeException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date result = null;
        try {
            result = format.parse(dateAsString);
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong hop le. Format chua dung dd/MM/yyyy");
            return null;
        }
        Date now = new Date();
        if (now.getYear() - result.getYear() < 18) {
            throw new AgeException("Account chua du 18 tuoi");
        }

        return result;
    }
}
