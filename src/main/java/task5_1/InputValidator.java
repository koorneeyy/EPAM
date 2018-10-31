package task5_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    public static final String NAME_REGEX = "[А-ЯЁA-Z][а-яёa-z]+";
    public static final String SURNAME_REGEX = "[А-ЯЁA-Z][а-яёa-z]+";
    public static final String BIRTHDAY_REGEX= "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
    public static final String PHONE_REGEX = "^\\+?(38)?\\(?(0)[0-9]{2}\\)?[0-9]{3}\\-?[0-9]{2}\\-?[0-9]{2}$";
    public static final String ADRESS_REGEX = "[a-zA-Z0-9_]*";

    public static boolean validate(String data,String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        matcher = pattern.matcher(data);
        if(! matcher.find()) {
            System.out.println("Incorrect input!!! ");
            return  false;
        }
        return true;
    }

}