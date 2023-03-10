package com.rishitha;

import java.util.*;
import java.util.stream.*;

class StreamUtil {
	public static void main(String args[]) {

		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		
		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x)
				.collect(Collectors.toList());
		System.out.println(square);
		List<Integer> square1 = number.stream().map(x -> x * x * x)
				.collect(Collectors.toList());
		System.out.println(square1);
		List<Integer> pow = number.stream().map(y -> y * 5)
				.collect(Collectors.toList());
		System.out.println(pow);

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection",
				"Stream"); 

		// demonstration of filter method
		List<String> result = names.stream().filter(s ->  s.startsWith("S"))
				.collect(Collectors.toList());
		System.out.println(result);
		List<String> result1 = names.stream().filter(s ->s.endsWith("n"))
				.collect(Collectors.toList());
		System.out.println(result1);
		
		// demonstration of sorted method  
		List<String> show = names.stream().sorted()
				.collect(Collectors.toList());
		System.out.println(show);

		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x)
				.collect(Collectors.toSet());  
		System.out.println(squareSet);    		

		// demonstration of forEach method
		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
		numbers.stream().map(a -> a * 100)
				.forEachOrdered(b -> System.out.println(b));
    
		// demonstration of reduce method
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0,
				(ans, i) -> ans + i);
		System.out.println(even);
	}
}