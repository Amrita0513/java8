package com.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		try {

			// Stream from Array, map, filter and print
			String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah" };
			Arrays.stream(names).map(x -> x.toLowerCase()).sorted().filter(x -> x.startsWith("a"))
					.forEach(x -> System.out.println(x)); // same as Stream.of(names)

			// Stream from Collections, map, filter and print
			List<Integer> number = Arrays.asList(2, 9, 3, 4, 5);
			number.stream().sorted().forEach(x -> System.out.println(x));
			number.stream().map(x -> x * x).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

			// Stream from Files, map, filter and print
			Stream<String> rows2 = Files.lines(Paths.get("src/main/java/com/demo/empList.csv"));
			rows2.map(x -> x.split(",")).filter(x -> x.length == 3).forEach(x -> System.out.printf(x[0], x[1]));
			rows2.close();
			System.out.println();

			// Stream from custom object as List, map, filter and print
			List<EmpData> empList = Arrays.asList(new EmpData("1", "A", "abc"), new EmpData("2", "B", "xyz"),
					new EmpData("3", "C", "pqr"), new EmpData("4", "D", "rst"));

			empList.stream().map(x -> x.getEmpId()).collect(Collectors.toList());

		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
