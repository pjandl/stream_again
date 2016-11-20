import java.util.List;
import java.util.Optional;

public class StreamFrag302 {

	public static void main(String[] args) {
		List<String> lista = Colecoes.outrosNomes;

		Optional<?> opt1 = null;
		opt1 = lista.stream()
				.findAny();
		System.out.println(opt1);
		
		lista.stream()
			.findFirst()
			.ifPresent(opt2 -> System.out.println(opt2));
		lista.stream()
			.filter(s -> s.equals("Peter Jandl Junior"))
			.findFirst()
			.ifPresent(opt2 -> System.out.println(opt2));
	}
}
