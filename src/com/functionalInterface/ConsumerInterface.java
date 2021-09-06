package src.com.functionalInterface;

import java.util.function.Consumer;

public class ConsumerInterface {
    /*
        void accept(T t)
     */
    public static void main(String[] args){
        // Method reference is used to initialize Consumer. This can also be a lambda expression.
        Consumer<Integer> displayDouble = ConsumerInterface::doubleIt;
        Consumer<Integer> display = ConsumerInterface::display;
        displayDouble.accept(3);
        display.andThen(displayDouble).accept(10);
    }

    public static void display(Integer value){
        System.out.print(value+" ");
    }

    public static void doubleIt(Integer value){
        System.out.println(value*2);
    }
}
