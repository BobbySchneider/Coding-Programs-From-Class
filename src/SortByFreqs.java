import java.util.*;

public class SortByFreqs {
	public String[] sort(String[] data) {
		TreeMap<String,Integer> map = new TreeMap<>();
		for(String s : data) {
			if (! map.containsKey(s)) {
				map.put(s, 0);
			}
			map.put(s, map.get(s)+1);
		}
		// map is up to date, sort by value -- ties broken alphabetically
		// since TreeSet will be in alpha order and sort is stable
		
		List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list,Map.Entry.comparingByValue(Comparator.reverseOrder()));
		
		// extract strings from each map.entry
		
		String[] ret = new String[list.size()];
		for(int index = 0; index < list.size(); index++){
			ret[index] = list.get(index).getKey();
		}
		return ret;
	}
}
