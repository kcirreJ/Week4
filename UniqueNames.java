package week4;

import java.util.ArrayList;

import acm.program.*;
import acmx.export.java.util.*;

public class UniqueNames extends ConsoleProgram {
	
	public void run () {
		
		ArrayList<String> names = new ArrayList<String>();
		while (true) {
			
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			if (!names.contains(name)) {
				names.add(name);
			}
		}
		System.out.println("Unique name list contains:");
		
		uniqueNames(names);
		
	}
	
	public void uniqueNames(ArrayList names) {
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}