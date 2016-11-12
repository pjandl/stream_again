import java.util.stream.IntStream;

public class StreamFrag202 {
	public static void main(String[] args) {
		String string = "Java 8 muito legal!";
		System.out.println(string);
		
		// obtém stream de char (valores int) de String
		IntStream charList = string.chars();
		// conta caracteres distintos
		long count = charList.distinct().count();
		System.out.println("Caracteres distintos: " + count);
	}

}
