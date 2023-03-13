package countAmongRepeatedWords;

import java.util.ArrayList;
import java.util.List;


public class methods {
	public static int countRepeatedProduct(List<String> list, String product) {
		
		return (int) list.stream()
			.filter(i -> i.equals(product))
			.count();
	}
	
}
