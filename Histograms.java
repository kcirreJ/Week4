package week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

public class Histograms extends ConsoleProgram {
	
	private int chartArray[];
	
	public void run() {
	
		chart();
		examScores();
		printChart();
	}
	
	private void chart() {
		
		chartArray = new int[11];
		for (int i = 0; i <= 10; i++) {
				chartArray[i] = 0;
		}
	}
		
	private void examScores() {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("MidtermScores.txt"));
			while (true) {
				String line = br.readLine();
				if (line == null) break;
				int grade = Integer.parseInt(line);
				if (grade < 0 || grade > 100) {
					throw new ErrorException("invalid");
				} else {
					int range = grade / 10;
					chartArray[range]++;
				}
	}
		
	} catch (IOException ex) {
		throw new ErrorException(ex);
	}
		
	}
	
	private void printChart() {
		
		for (int range = 0; range <= 10; range++) {
				String label;
				switch (range) {
				case 0:
					label = "00-09";
					break;
				case 10:
					label = " 100";
					break;
				default:
					label = (10 * range) + "-" + (10 * range + 9);
					break;
				}
				String asterisk = createAsterisk(chartArray[range]);
				System.out.println(label + ": " + asterisk);
		}
		
	}
	
	private String createAsterisk(int x) {
		String asterisk = "";
		for (int i = 0; i < x; i++) {
			asterisk += "*";
		}
		return asterisk;
	}
		
}
