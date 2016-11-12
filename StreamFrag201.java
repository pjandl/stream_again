import java.util.Collection;
import java.util.stream.Stream;

public class StreamFrag201 {
	public static void main(String[] args) {
		// usa gerador para criar coleção de 50 doubles
		Generator.SIZE = 50;
		Collection<Double> colecao = Generator.newDoubleCollection();

		// cria pipeline de três estágios
		Stream<Double> stream =
			    colecao.stream()              // obtém stream fonte
			           .filter(e -> e >= 5.0) // filtra valores >= 5
			           .limit(3);             // ret. stream c/ (até) 3 elem

		// exibe coleção
		StringBuffer out = new StringBuffer("|");
		stream.forEach(e -> out.append(e).append("|"));
		System.out.println(out);
	}

}
