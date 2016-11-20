import java.util.List;

public class StreamFrag305 {

	public static void main(String[] args) {
		List<String> lista = Colecoes.nomes;
		lista.stream().parallel()
			.forEach(s->System.out.println(s));

		System.out.println();
		
		Colecoes.nomes.stream()
			.forEachOrdered(System.out::println);
		
	}

}
