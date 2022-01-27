package com.techestop;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class OptionalsDemo
{
    public static void main( String[] args )
    {

        /*
         ************ 1. Creating Optional object ***************
         */
        //Using static empty() method of Optional class.

        /*Optional<String> optionalEmptyObj = Optional.empty();
        //isEmpty method available from Java 11
        System.out.println(optionalEmptyObj.isEmpty());

        //Using static of() method of Optional class. The value passed to of() method whouls ne non Null

        Optional<String> optionalNonEmptyObj = Optional.of("Test");
        System.out.println(optionalNonEmptyObj);


        //Using static ofNullable() method
        Optional<String> optionalNullableObj = Optional.ofNullable(null);
        System.out.println(optionalNullableObj);*/

















        /*
         ************ 2. Optional value checking ***************
         */
        /*Optional<String> optionalTestObj = Optional.of("Test");
        System.out.println(optionalTestObj.isPresent());*/

















        /*
         ************ 3. ifPresent method example ***************
         */
        /*Optional<String> optionalNonEmptyObj = Optional.of("Prateek");
        optionalNonEmptyObj.ifPresent((name) -> System.out.println("Name: "+name));*/

















        /*
         ************ 3. ifPresentOrElse method example ( Available from Java 9 ) ***************
         */
        /*Optional<String> optionalEmptyObj = Optional.empty();
        optionalEmptyObj.ifPresentOrElse((s) -> System.out.println(s),() -> System.out.println("Value unknown"));*/

















        /*
         ************ 4. orElse and orElseGet method example ***************
         */
        /*Optional<String> optionalNonEmptyObj = Optional.of("Prateek");
        Optional<String> optionalEmptyObj = Optional.empty();
        System.out.println(optionalNonEmptyObj.orElse("Hello"));
        System.out.println(optionalEmptyObj.orElseGet(()->"Hello"));*/

















        /*
         ************ 5. Get method example ***************
         */
        /*Optional<String> optionalNonEmptyObj = Optional.of("Prateek");
        System.out.println(optionalNonEmptyObj.get());

        //Trying to get null optional value leads to NoSuchElementException exception
        Optional<String> optionalNullableObj = Optional.ofNullable(null);
        optionalNullableObj.get();*/

















        /*
         ************ 6. Map method example ***************
         */
        /*String text = "My name is Prateek";
        Optional<String> optionalText = Optional.of(text);
        optionalText.map((s) -> s.length()).ifPresent((l) -> System.out.println("Length of the text: "+l));*/

















        /*
         ************ 7. Filter method example ***************
         */
        /*String text = "My name is Prateek";
        Optional<String> optionalText = Optional.of(text);
        System.out.println(optionalText.filter((s) -> s.contains("Prateek")).get());
        System.out.println(optionalText.filter((s) -> s.contains("Test")).isEmpty());*/


















        /*
         ************ 8. Equating 2 optional objects ***************
         * Two optional objects are equal when
         *  it is also an Optional and;
         *  both instances have no value present or;
         *  the present values are "equal to" each other via equals().
         */
        /*Optional<String> obj1 = Optional.of("Optional Object");
        Optional<String> obj2 = Optional.of("Optional Object");
        Optional<String> obj3 = Optional.of("Optional Object 3");
        System.out.println("check if the optional object obj1 and obj2 are equal or not: "+ obj1.equals(obj2));
        System.out.println("check if the optional object obj1 and obj3 are equal or not: "+ obj1.equals(obj3));
        String strObj = "Optional Object";
        System.out.println("check if the optional object obj1 and strObj are equal or not: "+ obj1.equals(strObj));*/


















        /*
         ************ 9. hashCode method example ***************
         */
        /*Optional<String> strObj = Optional.of("Optional");
        Optional<Integer> intObj = Optional.of(1);
        Optional<Boolean> boolObj = Optional.of(false);
        Optional<Integer> emptyObj = Optional.empty();
        System.out.println(strObj.hashCode());
        System.out.println(intObj.hashCode());
        System.out.println(boolObj.hashCode());
        System.out.println(emptyObj.hashCode());*/


















        /*
         ************ 10. Stream method example ***************
         * ( Introduced in Java 9 )
         */
        /*Optional<String> stringOptional = Optional.of("StrObj");
        Stream<String> strObjStream = stringOptional.stream();
        strObjStream.forEach(s -> System.out.println(s));
        Optional<String> emptyOptional = Optional.empty();
        Stream<String> emptyStrObjStream = emptyOptional.stream();
        emptyStrObjStream.forEach(s -> System.out.println(s));
*/





















    }
}
