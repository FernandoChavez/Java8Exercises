package com.fuerzadon.repeatedValues;

import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> values = List.of("hola", "como", "estan", "estan", "como", "yo", "muy", "bien", "bien");
		String word = "como";
		char letter ='e';
		System.out.println("Los duplicados son: "+methods.findDuplicatesWithSet(values));
		System.out.println("Cantidad de duplicados de "+ word+": "+methods.getNumberRepeats(values, word));
		System.out.println("Cantidad de palabras con la letra "+letter+": "+methods.getNumberRepeatIncludeALetter(values, letter));
	}

}
