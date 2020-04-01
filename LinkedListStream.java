package com.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListStream {

	public static void main(String[] args) {
		List<String> firstList = new LinkedList<>();
		firstList.add("pavan");
		firstList.add("pushpak");
		firstList.add("kumar");

		LinkedList<String> filtered = firstList.stream().filter(x -> x.startsWith("p"))
				.collect(Collectors.toCollection(LinkedList::new));

		System.out.println(filtered);

	}

}
