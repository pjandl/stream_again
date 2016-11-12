import java.util.Collection;
import java.util.stream.Stream;


public class StreamFrag204 {

	public static void main(String[] args) {
		// usa gerador para criar coleção de 20 Strings CCDc
		Collection<String> colecao = Generator.newStringCollection();
		// exibe coleção
		System.out.println("Coleção Inicial");
		colecao.forEach(e -> System.out.print(e + " "));
		
		// define pipeline de 3 estágios
		Stream<String> stream = colecao.stream()
			   .filter(e -> e.charAt(0)=='J')
			   .map(e -> e.substring(0, 1) + "ava" + e.substring(1))
			   .sorted();
		
		System.out.println("\nColeção Final");
		stream.forEach(e -> System.out.print(e + " "));
	}

}
