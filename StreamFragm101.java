package jandl.streamAgain;

import static jandl.streamAgain.Colecoes.nomes;

import java.util.stream.Stream;

public class StreamFragm101 {

	public static void main(String[] args) {
		// Uso de pipeline único
		// contagem dos nomes iniciados com "K"
		long cont = nomes.stream()
				.filter(n -> n.startsWith("K"))
				.count();
		System.out.println("Nomes iniciados com K: " + cont);

		// Sem pipeline (forma convencional)
		Stream<String> stream_0 = nomes.stream();
		Stream<String> stream_1 = stream_0.filter(n -> n.startsWith("K"));
		long cont2 = stream_1.count();
		System.out.println("Nomes iniciados com K: " + cont2);

		// Reuso dos strems provocaria exceção IllegalStateException
		// System.out.println(stream_1.count());
	}
}
