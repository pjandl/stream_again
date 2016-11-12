import java.util.Collection;
import java.util.stream.Stream;

public class StreamFrag203 {
	public static void main(String[] args) {
		// usa gerador para criar coleção de 50 doubles
		Generator.SIZE = 50;
		Collection<Double> colecao = Generator.newDoubleCollection();

		// cria pipeline de quatro estágios
		Stream<Double> stream =
			    colecao.stream()				// obtém stream fonte
			           .filter(e -> e < 6.0)	// filtra valores < 6
			           .sorted()				// ordena elementos
			           .skip(1)					// descarta primeiro	
			           .limit(5);				// ret. stream com (até) 5 elem

		// exibe coleção
		StringBuffer out = new StringBuffer("|");
		stream.forEach(e -> out.append(e).append("|"));
		System.out.println(out);
	}

}
