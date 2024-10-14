package checker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidPassword {
    private static final int MINIMUM_LENGTH = 8;

    public static boolean isPasswordValid(String password) {
        if (password.length() < MINIMUM_LENGTH)
            return false;

        Pattern upperCasePattern = Pattern.compile("[A-Z]");
        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        Pattern digitPattern = Pattern.compile("[0-9]");

        Matcher hasUpperCase = upperCasePattern.matcher(password);
        Matcher hasLowerCase = lowerCasePattern.matcher(password);
        Matcher hasDigit = digitPattern.matcher(password);

        return hasUpperCase.find() && hasLowerCase.find() && hasDigit.find();
    }
}
