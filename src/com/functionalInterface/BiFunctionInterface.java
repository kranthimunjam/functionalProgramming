package src.com.functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    /*
    prototype:

        @FunctionalInterface
        public interface BiFunction<T>
        {
            public R apply(T  t, U u);
            default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> func)
        }
     */

    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> sumSquare = (a,b)-> (a+b)*(a+b);

        Integer result = sumSquare.apply(2,3);
        System.out.println(result);

        // using andThen() to get the same result as above.
        BiFunction<Integer, Integer, Integer> sumAndSquare = (a, b) -> a + b;

        sumAndSquare = sumAndSquare.andThen(a -> a*a).andThen(a -> a); // Added identity function in the end to showcase function chaining.

        System.out.println(sumAndSquare.apply(2,3));

    }
}
