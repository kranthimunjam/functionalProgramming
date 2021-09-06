package src.com.functionalInterface;

import java.util.function.Function;

public class FunctionInterface {
    /*
    Function must take a parameter and must return a value.
    R apply(T t).
    andThen(func) :applied after 'this'
    compose(func) :applied before 'this'.

     */
    public static void main(String[] args){
        Function<Integer,Integer> square = (n)->(n*n);
        Function<Integer,Integer> add = (n)->(n+n);

        System.out.println(square.apply(2));
        System.out.println(square.andThen(add).apply(2)); // first squared then added so result = 8
        System.out.println(square.compose(add).apply(2)); // first added then squared so result = 16
    }
}
