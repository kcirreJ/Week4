package week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import acm.program.ConsoleProgram;

public class WordCount extends ConsoleProgram {
	
	static int count = 0;
	static int count2 = 0;
	static int count3 = 0;
	static File file = new File("lear.txt");
	
public static void words() {
	
	try {
	
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			sc.next();
			count++;
			}

			sc.close();
		
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("Words: " + count);
}

public static void characters() {
	
	try {
		
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			count3 += s.length();
			}

			sc.close();
		
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("Chars: " + count3);
	
}	

public static void lines() {
	
	
	
	try {
		
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			sc.nextLine();
			count2++;
		}
		
		sc.close();
		
	} catch (Exception e) {
		e.getStackTrace();
	}
	
	System.out.println("Lines: " + count2);
	
}



public static void main(String[] args) {
		
		System.out.println("File: lear.txt");
		lines();
		words();
		characters();
	
	}	
}