package case_study.services;

import java.util.Date;

public class RegexException {
    public static final String REGEX_ID_VILLA = "(SVVL)[-][0-9]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][0-9]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][0-9]{4}";
    public static final String REGEX_Name = "[A-Z][a-z]+";
    public static final String REGEX_AREA = "^([3-9][1-9]{2,})$";
    public static final String REGEX_COST = "^[0-9]+$";
    public static final String REGEX_FLOOR = "^[1-9]|([1][0-9])$";
    //public static final Date BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
}
