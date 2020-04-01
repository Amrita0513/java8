package com.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaCollectors {

	public static void main(String[] args) {

		try {

			// Collectors.toMap
			System.out.println("Map:   ");
			Map<String, String> empMap = Files.lines(Paths.get("src/main/java/com/demo/empList.csv"))
					.map(x -> x.split(",")).filter(x -> x.length == 3).collect(Collectors.toMap(x -> x[0], x -> x));

			for (String key : empMap.keySet()) {
				System.out.println(key + "  " + empMap.get(key));
			}
			// Collectors.toList
			System.out.println("\nList:   ");
			List<String> empList = Files.lines(Paths.get("src/main/java/com/demo/empList.csv"))
					.collect(Collectors.toList());
			
			empList.forEach(x -> System.out.println("" + x));

			// Collectors.toSet
			System.out.println("\nSet:   ");
			Set<String> empSet = Files.lines(Paths.get("src/main/java/com/demo/empList.csv"))
					.collect(Collectors.toSet());
			empSet.forEach(x -> System.out.println("" + x));

			// Custom Collectors Linked List
			System.out.println("\nLinkedList:   ");
			LinkedList<String> empLinkedList = Files.lines(Paths.get("src/main/java/com/demo/empList.csv"))
					.collect(Collectors.toCollection(LinkedList::new));
			empLinkedList.forEach(x -> System.out.println("" + x));
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
