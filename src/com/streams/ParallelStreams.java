package src.com.streams;

import src.com.functionalInterface.Utils;

import java.util.ArrayList;

public class ParallelStreams {
    public static void main(String[] args) {
        ArrayList<Double> list = Utils.getDoubleList();

        double product = list.parallelStream().reduce(1.0,(a,b)->a*b);
        System.out.println(product);

        // finding the product of the square roots.
        // here accumulator(BiFunction): (a,b)->a*Math.sqrt(b) finds the square root.
        // combiner(BinaryOperator) : (a,b)->a*b multiplies the square roots.
        double productOfSquareRoots = list.parallelStream().reduce(1.0,(a,b)->a*Math.sqrt(b),(a,b)->a*b);
        System.out.println(productOfSquareRoots);

        // this is different from the above because it is product of square roots of each number.
        double productOfSquareRoots2 = list.parallelStream().reduce(1.0,(a,b)->a*Math.sqrt(b));
        System.out.println(productOfSquareRoots2);
    }
}
