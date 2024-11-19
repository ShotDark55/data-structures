package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TextToString {
	private String text;
	
	public TextToString(String text) {
		this.text = text;
	}
	
	private static Scanner scanner;	
	
	private ArrayList<String> Preword() {
		scanner = new Scanner(text);
		ArrayList<String> list = new ArrayList<>();
		
		while(scanner.hasNext()) {
			list.add(scanner.next());
		}
		
		return list;
	}
	
	
	private ArrayList<String> Preline() {
		scanner = new Scanner(text);
		ArrayList<String> list = new ArrayList<>();
		
		while(scanner.hasNext()) {
			list.add(scanner.nextLine());
		}
		
		return list;
	}
	
	
	public String line(boolean sort) {
		String d = "";
		ArrayList<String> l = Preline();
		if (sort) {
			Collections.sort(l);
		}
		
		for (String string : l) {
			d += string + "\n";
		}
		
		return d;
	}
	
	
	public String word(boolean sort) {
		String d = "";
		ArrayList<String> l = Preword();
		if (sort) {
			Collections.sort(l);
		}
		
		for (String string : l) {
			d += string + "\n";
		}
		
		return d;
		
	}

}
