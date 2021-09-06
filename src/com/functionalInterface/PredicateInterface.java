package src.com.functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateInterface {
    /*
    prototype:

        @FunctionalInterface
        public interface Predicate<T>
        {
            public boolean test(T  t);
            default Predicate<T> and(Predicate<? super T> other){}
            default Predicate<T> negate(){}
            default Predicate<T> or(Predicate<? super T> other){}
            static <T> Predicate<T> isEqual(Object targetRef){}
        }
     */

    public static void main(String[] args ){
        Predicate<Integer> isEvenNumber = (n)->(n%2==0);
        Predicate<Integer> isPositive = (n)->(n>0);
        Predicate<Integer> isZero = (n)->(n==0);


        ArrayList<Integer> list = Utils.getList();

        Stream<Integer> stream = list.stream();
        stream.forEach((n)->{
            System.out.print(n+" ");
            if(isZero.test(n)) System.out.println("Zero");
            if(isZero.negate().test(n)) System.out.println("not a Zero");
            if(isPositive.and(isEvenNumber).test(n)) System.out.println("Positive and Even");
            if(isPositive.negate().or(isEvenNumber.negate()).test(n)) System.out.println("Negative or Odd");
            else if (isPositive.negate().test(n)) System.out.println("Negative");
            else System.out.println("Error");
        });
    }
}
