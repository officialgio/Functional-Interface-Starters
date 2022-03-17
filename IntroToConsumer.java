package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class IntroToConsumer {

    public static void main(String[] args) {
        // Normal
        Customer giovanny = new Customer("Giovanny", "07328323", 8);
        greetCustomer(giovanny); // Hello Giovanny, thanks for registering phone number 07328323

        //Consumer Functional Interface
        greetCustomerConsumer.accept(giovanny); // Hello Giovanny, thanks for registering phone number 07328323
        //BiConsumer
        greetCustomerConsumerV2.accept(giovanny, false); // Hello Giovanny, thanks for registering phone number *******

    }

    // BiConsumer takes two arguments
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*******")); // if number exist print else print "*****"

    // normal void
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }
    // similar to a void method
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
                    + customer.customerPhoneNumber);



    // Don't have inner classes - this is only for fast visual results purposes.
    // if you wish to have a class of your own crete one on a separate class from this.
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;
        private final int age;

        Customer(String customerName, String customerPhoneNumber, int age) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
            this.age = age;
        }
    }
}
