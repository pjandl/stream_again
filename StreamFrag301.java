import java.util.Arrays;
import java.util.List;

public class StreamFrag301 {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("zEro", "Um", "DoIs", "TRes", "QuaTRo", "CiNcO", "SEIS", "setE", "oITo", "noVe", "DeZ");

		long c = lista.stream()
			.map(s -> s.toUpperCase())
			.filter(s -> s.length()==4)
			.filter(s -> s.endsWith("RO"))
			.count();
		System.out.println(c);
		
		System.out.println("lista[ todos|inicial 'Q']? " +
				lista.stream().
				allMatch(s -> s.toUpperCase().startsWith("Q")));
		System.out.println("lista[ algum|compr.==3]? " +
				lista.stream().
				anyMatch(s -> s.length()==3));
		System.out.println("lista[nenhum|final 'x']? " +
				lista.stream().
				noneMatch(s -> s.toLowerCase().endsWith("x")));
	}
}
