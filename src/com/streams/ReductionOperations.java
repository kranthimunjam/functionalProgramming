package src.com.streams;

import src.com.functionalInterface.Utils;

import java.util.ArrayList;
import java.util.Optional;

public class ReductionOperations {
    public static void main(String[] args){
        ArrayList<Integer> list = Utils.getList();

        long count = list.stream().count();
        System.out.println(count);

        // Using reduce to get the product of the objects.
        Optional<Integer> objectProduct = list.stream().reduce((a, b)->(a*b));
        objectProduct.ifPresent(System.out::println);

        // Using reduce alternate prototype(the one with identity element) to get the product of the objects.
        Integer product = list.stream().reduce(1,(a, b)->(a*b));
        System.out.println(product);

        // product of the even numbers.
        Integer evenProduct = list.stream().reduce(1,(a, b)->{
            if(b%2==0) return (a*b);
            else return a;
        });
        System.out.println(evenProduct);  // prints 2*4*6 = 48.
    }
}
