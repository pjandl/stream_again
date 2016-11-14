package jandl.streamAgain;

import static jandl.streamAgain.Colecoes.nomes;
import static jandl.streamAgain.Colecoes.outrosNomes;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFragm102 {

	public static void main(String[] args) {
		// Cria coleção (subclasse de Collection) com conteúdo Integer
		ArrayList<Integer> colecao = new ArrayList<Integer>();
		// Adiciona conteúdo: números de 0 a 50, de 2 em 2
		for (int i = 0; i < 50; i+=2) {
		    colecao.add(i);
		}
		// Obtém stream da coleção de Integer
		Stream<Integer> streamI = colecao.stream();
		
		// Obtém stream a partir de array de elementos do tipo Dimension
		Dimension[] dimemsionArray = {new Dimension(19, 64), new Dimension(68, 19), 
				new Dimension(19, 31), new Dimension(95, 19),
				new Dimension(13, 20), new Dimension(20, 16)}; 
		Stream<?> stream = Stream.of(dimemsionArray);
		
		// Obtém stream de String a partir de outras streams de Strings
		Stream<String> sAll = Stream.concat(nomes.stream(), outrosNomes.stream());

		// Obtém stream a partir de gerador infinito de Double entre [0, 100)
		Stream<Double> streamD = Stream.generate(() -> 100*Math.random());
	}
}
