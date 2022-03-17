package functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class GettingStarted {

    public static void main(String[] args) {

        // Functions
        System.out.println("Functions");
        int increment = incrementByOne(1);
        System.out.println(increment); // 2

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2); // 2

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply); // 20

        int addAndMultiply = addBy1AndThenMultiplyBy10.apply(4);
        System.out.println(addAndMultiply); // 50

        //BiFunction takes 2 arguments and produces 1 result
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100) // 500
        );


    }

    //Function (Normal way)
    public static int incrementByOne(int number) {
        return number + 1;
    }

    /**
     * Input: Type Int
     * Output: Type Int
     */
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    //Chaining functions with andThen
    static Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
            incrementByOneFunction.andThen(multiplyBy10Function);

    //BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
