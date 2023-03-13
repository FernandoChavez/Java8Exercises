package countAmongRepeatedWords;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List <String> list = Arrays.asList("Book", "Toy", "Videogame", "Book", "Disc", "Earphone", "Phone", "Phone", "Disc",
				"Videogame", "Book");
		
		System.out.println("Book is repeated "+methods.countRepeatedProduct(list, "Book") );
	}

}
