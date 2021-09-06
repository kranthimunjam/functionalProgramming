package src.com.functionalInterface;

import java.util.function.Supplier;

public class SupplierInterface {
    /*
    Supplier takes no parameters and returns value;
    T get(){}
     */
    public static void main(String[] args){
        Supplier<Double> randomNumber = SupplierInterface::getRandom; // Here instead of method reference, lambda can also be used.

        System.out.println(randomNumber.get());
    }

    public static Double getRandom(){
        return Math.random();
    }
}
