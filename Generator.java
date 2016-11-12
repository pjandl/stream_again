import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Generator {
	public static int SIZE = 100;
	public static double LOWER_LIMIT = 0.0;
	public static double UPPER_LIMIT = 10.0;
	    
	// cria coleção com String no formato CCDc randômicas
    public static Collection<String> newStringCollection() {
        List<String> stringList = new ArrayList<>();
        char[] charArray = new char[4];
        for (int i = 0; i < SIZE; i++) {
            charArray[0] = (char) (65 + (int) (Math.random() * 26));
            charArray[1] = (char) (65 + (int) (Math.random() * 26));
            charArray[2] = (char) (48 + (int) (Math.random() * 10));
            charArray[3] = (char) (97 + (int) (Math.random() * 26));
            stringList.add(new String(charArray));
        }
        return stringList;
    }
    
	// cria coleção com valores double randômicos
    public static Collection<Double> newDoubleCollection() {
		List<Double> doubleList = new LinkedList<>();
		for(int i=0; i<SIZE; i++) {
			doubleList.add(LOWER_LIMIT + (UPPER_LIMIT-LOWER_LIMIT)*Math.random());
		}
    	return doubleList;
    }
    
    
}
