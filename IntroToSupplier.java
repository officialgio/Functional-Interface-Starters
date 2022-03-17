package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

/**
 * Supplier returns any kind of value you want(all data types) or (objects, Data Strucutre,etc.)
 */
public class IntroToSupplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionURL()); // jdbc://localhost:5432/users
        System.out.println(getDBCConnectionURLSupplier.get()); // [jdbc://localhost:5432/users]
    }

    // normal
    static String getDBConnectionURL() {
        return "jdbc://localhost:5432/users";
    }

    // you can return anything
    // supplier has "() -> " by default
    static Supplier<List<String>> getDBCConnectionURLSupplier = ()
            -> List.of("jdbc://localhost:5432/users");

}
