package src.com.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
    /*
    BinaryOperator interface implements
    T apply(T t1, T u)
     */
    public static void main(String[] args ){
        BinaryOperator<Integer> makeNumber = (a,b)->{ return a*10+b;};

        BinaryOperator<Integer> minComparator = BinaryOperator.minBy((a,b)->(a-b));
        BinaryOperator<Integer> maxComparator = BinaryOperator.maxBy((a,b)->(a-b));

        System.out.println(makeNumber.apply(4,7)); // displays 47.
        System.out.println(minComparator.apply(4,7)); // displays 4
        System.out.println(maxComparator.apply(4,7)); // displays 7
    }
}
