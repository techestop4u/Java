package com.techestop;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class contains code examples related to Streams
 *
 */
public class StreamsJavaCode {

    public static void printStreamValues(String streamName, Stream s) {
        System.out.println("Printing stream values for " + streamName);
        s.forEach(str -> System.out.println(str));
        System.out.println();
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        /*
         ************* 1. Stream creation ***********************
         */
        /*//Creating an empty sequential stream
        Stream<String> stringStream1 = Stream.empty();
        printStreamValues("stringStream1", stringStream1);


        //Creating a stream out of an ArrayList
        List<String> stringList = Arrays.asList("str1", "str2", "str3");
        Stream<String> stringStream2  = stringList.stream();
        printStreamValues("stringStream2", stringStream2);


        //Creating a stream out of String array
        String[] strings = new String[]{"a","b","c"};
        Stream<String> stringStream3 = Arrays.stream(strings);
        printStreamValues("stringStream3", stringStream3);

        //Creating an infinite sequential stream and then limiting the number of elements to 10
        Stream<String> stringStream4 = Stream.generate(() -> "item").limit(10);
        printStreamValues("stringStream4", stringStream4);

        //Creating a stream with an initial value and subsequent elements ( generated after applying the function ).
        //Lastly limiting the value to 20.
        Stream<Integer> intStream = Stream.iterate(20, n -> n + 1).limit(20);
        printStreamValues("intStream", intStream);*/





























        /*
         ************* 2. Referencing a Stream ***********************
         */

        /*List<String> stringList = Arrays.asList("str1", "Str2", "str3");
        Stream<String> stream = stringList.stream().filter((s) -> s.contains("str"));
        Optional<String> result = stream.findFirst();
        System.out.println(result);

        //Using the stream again will cause IllegalStateException
        stream = stringList.stream().filter((s) -> s.contains("str"));
        Optional<String> result2 = stream.findAny();
        System.out.println(result2);*/
















        /*
         ************* 3/4. Intermediate and Terminal operations ***********************
         */

        /*List<String> unmappedList = Arrays.asList("str1", "Str2", "str3");
        Stream<String> mappedStream = unmappedList.stream().map(s -> s + " value");
        printStreamValues("mappedStream", mappedStream);


        IntStream intStream = IntStream.range(0, 20).skip(5);
        System.out.println("Printing values for intStream");
        intStream.forEach(i -> System.out.println(i));

        int sum = IntStream.range(4, 10).peek(i -> System.out.println("Integer value being processed : " + i)).sum();
        // 4 + 5 + 6 + 7 + 8 + 9 = 39
        System.out.println("Sum of integers from 4 to 9 is " + sum);


        List<Integer> unsortedIntLIst = Arrays.asList(5, 9, 10, 4);
        Optional<Integer> maxValue = unsortedIntLIst.stream().max((a, b) -> {
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println("Max Value is : " + maxValue);

        List<Integer> dupeElementList = Arrays.asList(5, 9, 10, 4, 7, 5, 0, 9);
        printStreamValues("distinctElementList", dupeElementList.stream().distinct());*/















        /*
         ************* 5. Lazy invocation ***********************
         */

        /*List<String> stringList = Arrays.asList("str1", "Str2", "str3");
        Optional<String> streamFirst = stringList.stream().filter(element -> {
            System.out.println("filter() was called for "+element);
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called for "+element);
            return element.toUpperCase();
        }).findFirst();
        System.out.println(streamFirst);*/












        /*
         ************* 6. Order of Execution ***********************
         */
        /*List<String> list = Arrays.asList("String1","String2","String3");
        long size = list.stream().map(element -> element.substring(0, 3)).peek((s) -> System.out.println("Element being processed : "+ s) ).skip(2).count();
        System.out.println(size);*/














        /*
         ************* 7. Reduce and Collect method ***********************
         */

        /*List<Integer> intList = Arrays.asList(3,5,6);
        Stream<Integer> integerStream = intList.stream();
        Optional<Integer> result = integerStream.reduce((a,b) -> a+b);
        result.ifPresent((i) -> System.out.println(i.intValue()));


        intList = Arrays.asList(3,5,6);
        integerStream = intList.stream();
        System.out.println(integerStream.collect(Collectors.averagingInt(Integer::intValue)));


        List<String> stringList = Arrays.asList("Hello","This","is","Prateek");
        Stream<String> stringStream = stringList.stream();
        System.out.println(stringStream.collect(Collectors.joining(" ","*** "," ***")));
*/












        /*
         ************* 8. Parallel Streams ***********************
         */


        /*IntStream parallelStream = IntStream.range(0, 100000).parallel();
        boolean isParallel = parallelStream.isParallel();
        System.out.println("isParallel variable value is "+isParallel);
        System.out.println("Calculated sum: "+parallelStream.sum());*/














        /*
         ************* 9. Flat map ***********************
         */

        Path filePath = Paths.get("src","main","resources","FlatMapDemo");
        Stream<String> lines = Files.lines(filePath, StandardCharsets.UTF_8);
        Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
        printStreamValues("words",words);


    }


}

