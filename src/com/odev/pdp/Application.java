//21 March 2015 Saturday
//=======================
//Nida Nur Nazli	-	b131210086
//Umutcan Erturk	-	b131210008
//Burak Guleryuz	-	b121210004
//=======================


package com.odev.pdp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {

	public int generateRandom(int min, int max) { // generates number between
													// min and max+min
		return min + (int) (Math.random() * max);
	}

	public void sendToText(int arg1, int arg2) throws IOException {

		File random = new File("random.txt");

		if (!random.exists())
			random.createNewFile();

		FileWriter fileW = new FileWriter(random);
		PrintWriter writer = new PrintWriter(fileW);
		
		writer.write(String.valueOf(arg1) + "\n" + String.valueOf(arg2));//string.valueOf is a function provides you to make arguman's integer value.
	
		writer.close();
	}

	public int[] readFromText() throws FileNotFoundException {      //if file cannot found, throws exception
		
		int[] numbers = new int[2];		//array for numbers that are read from file
		
		Scanner scanner = new Scanner(new File("random.txt"));

		int count = 0;
		while (scanner.hasNextInt())
			numbers[count++] = scanner.nextInt();

		scanner.close();

		return numbers;		//returns array
	}

	public int geometricAverage(int[] arr) {

		return (int) Math.pow(arr[0] * arr[1], 0.5);	//0.5th power of multiplied first two array members.
	}

}
