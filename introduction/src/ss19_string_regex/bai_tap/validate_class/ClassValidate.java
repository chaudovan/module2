package ss19_string_regex.bai_tap.validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValidate {
    private static final String CLASS_REGEX = "^[ACP][0-9]{4}[GHIKLM]$";
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
