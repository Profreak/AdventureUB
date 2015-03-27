package de.l_infotech.adventure.view;

import java.util.List;

public class TextOut {

	public void println(String string) {
		System.out.println(string);
	}

	public void printList(List<String> listOfPossibilities) {
		
		int a = 0;
		for(String s : listOfPossibilities) {
			println( a + ": " + s);
			a++;
		}
		
	}

}
