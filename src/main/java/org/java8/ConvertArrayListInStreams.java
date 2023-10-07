//package org.java8;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Write Program to - Convert ArrayList in Streams - in java 8
// */
//public class ConvertArrayListInStreams {
//
//    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("ank");
//        stringList.add("sam");
//        stringList.add("az");
//        stringList.add("neh");
//        stringList.add("ad");
//
//       // stringList.sort();
//
//        // In one line display all records that start with 'a' in stringList
//        System.out.println("\n1. Use stream for filtering and display");
//        stringList.stream() // Convert list (ArrayList) to Stream
//                .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
//                .forEach(System.out::println); // Displays  - ank, az, ad
//
//        // In one line display all records (in sorted manner - ASCENDING) that start with 'a' in stringList
//        System.out.println("\n2. Use stream for filtering, sorting and display (in sorted manner - ASCENDING order )");
//        stringList.stream() // Convert list to Stream
//                .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
//                .sorted()  //SORT the list (ASCENDING order)
//                .forEach(System.out::println); // Displays - ad, ank, az
//
//        // In one line display all records (in sorted manner - DESCENDING) that start with 'a' in stringList
//        System.out.println("\n3. Use stream for filtering, sorting and display(in sorted manner - DESCENDING order)");
//        stringList.stream() // Convert list to Stream
//                .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
//                .sorted((a, b) -> b.compareTo(a))  //SORT the list (DESCENDING order)
//                .forEach(System.out::println); // Displays - az, ank, ad
//
//
//        // In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stringList
//        System.out.println("\n4. Use stream for filtering, UPPERCASE conevrsion, sorting and display");
//
//        stringList.stream()
//                .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
//                .map(String::toUpperCase) //CONVERT to UPPERCASE
//                .sorted()  //SORT the list (ASCENDING order)
//                .forEach(System.out::println);  // Displays - AD, ANK, AZ
//
//
//        System.out.println("");
//
//
//        // In one line find whether any record start with 'a' in stringList
//        boolean anyRecordStartsWithA = stringList.stream().anyMatch(s -> s.startsWith("a"));                                                                                           anyMatch((s) -> s.startsWith("a"));
//        System.out.println("any Record Starts With 'a'  = "+anyRecordStartsWithA); //true
//
//        // In one line find whether all records start with 'a' in stringList
//        boolean allRecordStartsWithA = stringList.stream().allMatch(s -> s.startsWith("a"));                                                                                     allMatch((s) -> s.startsWith("a"));
//        System.out.println("all Record Starts With 'a'  = "+allRecordStartsWithA); //false
//
//        //In one line find whether none of the records start with 'b' in stringList
//        boolean noneRecordStartsWithB = stringList.stream().
//                noneMatch((s) -> s.startsWith("b"));
//        System.out.println("none Record Starts With 'B' = "+ noneRecordStartsWithB); // true
//
//        // In one line count records start with 'a' in stringList
//        long countOfRecordsStartsWithA = stringList.stream().
//                filter((s) -> s.startsWith("a")).count();
//        System.out.println("countOfRecordsStartsWithA = "+countOfRecordsStartsWithA); // 3
//
//
//    }
//
//}
//
///* OUTPUT
//
//
//1. Use stream for filtering and display
//ank
//az
//ad
//
//2. Use stream for filtering, sorting and display (in sorted manner - ASCENDING order )
//ad
//ank
//az
//
//3. Use stream for filtering, sorting and display(in sorted manner - DESCENDING order)
//az
//ank
//ad
//
//4. Use stream for filtering, UPPERCASE conevrsion, sorting and display
//AD
//ANK
//AZ
//
//any Record Starts With 'a'  = true
//all Record Starts With 'a'  = false
//none Record Starts With 'B' = true
//countOfRecordsStartsWithA = 3
//
//*/
