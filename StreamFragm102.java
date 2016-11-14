package jandl.streamAgain;

import static jandl.streamAgain.Colecoes.nomes;
import static jandl.streamAgain.Colecoes.outrosNomes;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFragm102 {

	public static void main(String[] args) {
		// Cria cole��o (subclasse de Collection) com conte�do Integer
		ArrayList<Integer> colecao = new ArrayList<Integer>();
		// Adiciona conte�do: n�meros de 0 a 50, de 2 em 2
		for (int i = 0; i < 50; i+=2) {
		    colecao.add(i);
		}
		// Obt�m stream da cole��o de Integer
		Stream<Integer> streamI = colecao.stream();
		
		// Obt�m stream a partir de array de elementos do tipo Dimension
		Dimension[] dimemsionArray = {new Dimension(19, 64), new Dimension(68, 19), 
				new Dimension(19, 31), new Dimension(95, 19),
				new Dimension(13, 20), new Dimension(20, 16)}; 
		Stream<?> stream = Stream.of(dimemsionArray);
		
		// Obt�m stream de String a partir de outras streams de Strings
		Stream<String> sAll = Stream.concat(nomes.stream(), outrosNomes.stream());

		// Obt�m stream a partir de gerador infinito de Double entre [0, 100)
		Stream<Double> streamD = Stream.generate(() -> 100*Math.random());
	}
}
