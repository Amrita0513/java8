package com.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapJava8Demo {

	public static void main(String[] args) {

		System.out.println("HashMap Implementation:  ");

		Map<Object, Integer> scores = new HashMap<>();
		scores.put("Rohit", 140);
		scores.put("Dinesh", 70);
		scores.put("Dhoni", 90);
		scores.put("Kholi", 100);
		scores.put("Sachin", 150);
		scores.put("Dravid", 130);

		scores.entrySet().stream().forEach(x -> System.out.println(x));

		System.out.println("\nTreeMap Implementation:  ");

		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("B", 1);
		treeMap.put("C", 5);
		treeMap.put("A", 9);
		treeMap.put("D", 2);

		treeMap.entrySet().stream().forEach(x -> System.out.println(x));

		System.out.println("\nLinkedHashMap Implementation:  ");

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Rohit", 140);
		linkedHashMap.put("Dinesh", 70);
		linkedHashMap.put("Dhoni", 90);
		linkedHashMap.put("Kholi", 100);
		linkedHashMap.put("Sachin", 150);
		linkedHashMap.put("Dravid", 130);

		linkedHashMap.entrySet().stream().forEach(x -> System.out.println(x));

		System.out.println("\nHashMap hashcode() and equals() Implementation:  ");

		Map<EmpData, String> empMap = new HashMap<>();
		EmpData employee1 = new EmpData("E123", "Amrita", "Pune");
		EmpData employee2 = new EmpData("E124", "Singh", "Bangalore");
		EmpData employee3 = new EmpData("E125", "Abc", "City");
		EmpData employee4 = new EmpData("E124", "Singh", "Bangalore");

		empMap.put(employee1, employee1.getEmpId());
		empMap.put(employee2, employee2.getEmpId());
		empMap.put(employee3, employee3.getEmpId());
		empMap.put(employee4, employee4.getEmpId());

		empMap.entrySet().stream().forEach(x -> System.out.println(x));

	}

}
