package checker;

public class InvalidAge {
    private static final int MINIMUM_AGE = 13;

    public static boolean isAgeValid(int age) {
        return age < MINIMUM_AGE;
    }
}
