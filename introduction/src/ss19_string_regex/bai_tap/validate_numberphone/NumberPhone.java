package ss19_string_regex.bai_tap.validate_numberphone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    public static final String PHONE_REGEX = "^[(][0-9]{2}[)][-][(][0-9]{10}[)]$";
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
