import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFrag304 {

	public static void main(String[] args) {
		long somaBlue = 0;
		
		for(Color c: Colecoes.cores) {
			somaBlue = somaBlue + c.getBlue();
		}
		System.out.println(somaBlue);
		
		somaBlue = Colecoes.cores.stream()
			.map(c -> c.getBlue()) // mapeia cor RGB em seu valor Blue
			.reduce(0, (x,y) -> x + y); // redução (soma dos elementos)
		System.out.println(somaBlue);
		

		Integer array[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int soma = 0; 
		
		soma = Stream.of(array) // stream obtida de array
				.reduce(0, (x,y) -> x + y); // redução (soma dos elementos)
		System.out.println(soma);
		
		List<Integer> lista = Arrays.asList(array); // lista obtida de array
		soma = lista.stream() // stream obtida de lista
				.reduce(0, Integer::sum); // redução (soma dos elementos)
		System.out.println(soma);
		
	}
}
