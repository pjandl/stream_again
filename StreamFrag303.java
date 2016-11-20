import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamFrag303 {

	public static void main(String[] args) {
		List<String> lista = Colecoes.nomes;
		Optional<?> opt = null;
		opt = lista.stream()
			.map(s -> s) // adição de operação intermediária dummy
			.min(Comparator.comparing(s -> s.length()));
		System.out.println(opt);
		
		Colecoes.cores.stream()
			.map(c -> c.getRed()) // mapeia cor RGB em seu valor Red
			.max(Comparator.comparing(s -> s)) // comparador elementar
			.ifPresent(v -> System.out.println(v));
	}
}
