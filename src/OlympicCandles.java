import java.util.*;

public class OlympicCandles {
	public int numberOfNights(int[] candles) {
		List<Integer> list = new ArrayList<>();
		for(int c : candles) list.add(c);
		int n = 1;
		Collections.sort(list,Comparator.reverseOrder());	
		
		while (true) {
			
			for(int k=0; k < n; k++) {
				list.set(k, list.get(k)-1);
			}
			Collections.sort(list,Comparator.reverseOrder());	
			if (n == list.size() || list.get(n) == 0) {
				return n;
			}	
			n += 1;
		}
	}
	
}
