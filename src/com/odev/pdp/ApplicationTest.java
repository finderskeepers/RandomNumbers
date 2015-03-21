//21 March 2015 Saturday
//=======================
//Nida Nur Nazli	-	b131210086
//Umutcan Erturk	-	b131210008
//Burak Guleryuz	-	b121210004
//=======================


package com.odev.pdp;

import java.io.IOException;

public class ApplicationTest {
	public static void main(String[] args) throws IOException {
		
		Application app = new Application();
		
		int random1, random2;
		
		random1 = app.generateRandom(10, 89);		//generates between first arg you write and sec + first.
		random2 = app.generateRandom(100, 899);
		
		app.sendToText(random1, random2);			//send numbers to the random.txt file.
		
		System.out.println(app.geometricAverage(app.readFromText()));	//reads numbers from the random.txt file, and 
																	   //generates the geometric average of them.
	}
}
