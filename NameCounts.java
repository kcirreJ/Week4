package week4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {
	
	public void run() {
		
		HashMap<String,Integer> savedNames = new HashMap<String,Integer>();
		list(savedNames);
		counts(savedNames);
	}
	
	public void list(Map<String,Integer> map) {
		
		while (true) {
			
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			Integer count = map.get(name);
			if (count == null) {
				
				count = new Integer(1);
			} else {
				count = new Integer(count + 1);
			}
			
			map.put(name, count);
		}
		
	}
	
	public void counts(Map<String,Integer> map) {
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			
			String key = it.next();
			int count = map.get(key);
			
			System.out.println("Entry [" + key + "] has count " + count);
			
		}
		
	}
	
}
