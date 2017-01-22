package com.test.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New Test");
		String[] obj = {"abc", "def", "ghi"};
        //int numbers []= {1,2,3,4};
        Collection<String> c = Arrays.asList("123","abc","456","def","789","");
        //get stream only
        Stream<String> stream = c.stream();
        c.stream().forEach(System.out::println);
        
        //count empty spaces
        System.out.println("count="+c.stream().filter(string -> string.isEmpty()).count());
        
        //collect all non empty elements and make a string
        String mergeString = c.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(" , "));
        System.out.println(mergeString);
        
        
        //c.stream().sorted().forEach(System.out::println);
        
        c.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);
        
        
        Collection<Integer> numbers = Arrays.asList(2,3,4,5);
        //List<Integers> listNo = numbers.stream().map(x->x*x).distinct().collect(Collectors.toList());
        
        numbers.stream().limit(2).forEach(System.out::println);
        
        IntSummaryStatistics stats = numbers.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("stats avg="+stats.getAverage());
        System.out.println("stats min ="+stats.getMin());
	}

}
