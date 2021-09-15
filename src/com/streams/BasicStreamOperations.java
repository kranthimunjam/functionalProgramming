package src.com.streams;

import src.com.functionalInterface.Utils;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BasicStreamOperations {
    public static void main(String[] args){
        ArrayList<Integer> list = Utils.getList();

        Stream<Integer> stream1 = list.stream();
        Optional<Integer> min = stream1.min(Integer::compare);
        min.ifPresent(System.out::println);

        // must obtain a new stream because min()(like many other methods) is a terminal operation that consumes stream.
        Stream<Integer> stream2 = list.stream();
        Optional<Integer> max = stream2.max(Integer::compare);
        max.ifPresent(System.out::println);

        // sorting the stream
        Stream<Integer> sortedStream = list.stream().sorted();

        sortedStream.forEach(BasicStreamOperations::display); // print each object in the stream using forEach.
        System.out.println();

        // using filter to filter out even numbers
        Stream<Integer> evenStream = list.stream().filter((n)->((n%2)==0)); // filter takes predicate as param.
        evenStream.forEach(BasicStreamOperations::display);

        // Intermediate operations can be chained. Using filter chaining to apply multiple filters.
        Predicate<Integer> isOdd = (n)->((n%2)==1);
        Predicate<Integer> isGreaterThanOne = (n)->n>1;
        Stream<Integer> oddStream = list.stream().filter(isOdd.and(isGreaterThanOne)) ; // filter odd numbers >1.
        oddStream.forEach(BasicStreamOperations::display); //displays 3 5
    }

    public static void display(Integer value){
        System.out.print(value+" ");
    }
}
