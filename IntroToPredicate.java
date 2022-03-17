package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class IntroToPredicate {

    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000")); // true
        System.out.println(isPhoneNumberValid("09060000000")); // false

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000")); // true
        System.out.println(isPhoneNumberValidPredicate.test("09060000000")); // false

        //BiPredicate
        System.out.println(checkSameLength.test("Hello", 5)); // true

    }

    // Normal Way
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    // BiPredicate
    static BiPredicate<String, Integer> checkSameLength = (x, y) ->
            x.length() == y;
}
