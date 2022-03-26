


package com.app.model;

import java.util.*;

public class BookAdvice {

	public static List<String>  getBookOnTopic(String topic) {
		List<String> booksNames = new ArrayList<String>();

		if (topic.equals("Java")) {
			booksNames.add("head first core java");
			booksNames.add("thinking in java");
			booksNames.add("yet another program insignificant notes");
		} else if (topic.equals("Servlet")) {
			booksNames.add("head first servlet jsp");
			booksNames.add("trainer cheetsheet");
		} else if (topic.equals("Spring")) {
			booksNames.add("begining spring");
			booksNames.add("Spring in action");
			booksNames.add("trainer cheetsheet");
		}

		return booksNames;
	}

}