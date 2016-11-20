import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colecoes {
	// Coleção 1: lista de nomes
	public static List<String> nomes = new ArrayList<>();
	// Coleção 2: outra lista de nomes
	public static List<String> outrosNomes = new ArrayList<>();
	
	// inicializador estático
	static {
		nomes.add("Peter Drucker");
		nomes.add("Nicholas Negroponte");
		nomes.add("Karl Albrecht");
		nomes.add("Arno Penzias");
		nomes.add("James Adams");
		nomes.add("Kevin Kelly");
		nomes.add("Fareena Sultan");
		//
		outrosNomes.add("Ken Thompson");
		outrosNomes.add("Dennis Ritchie");
		outrosNomes.add("Brian Kernighan");
		outrosNomes.add("Bjarne Stroustrup");
		outrosNomes.add("James Gosling");
		outrosNomes.add("Anders Hejlsberg");
		outrosNomes.add("Martin Odersky");
	}
	
	// Coleção 3: uma lista de cores
	public static List<Color> cores = Arrays.asList(Color.WHITE, Color.GREEN, Color.YELLOW, Color.BLUE);
}
