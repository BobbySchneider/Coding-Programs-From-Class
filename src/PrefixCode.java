
public class PrefixCode {
	public String isOne(String[] words) {
		for(int k=0; k < words.length; k++) {

			for(int j=0; j < words.length; j++) {
				if (j == k) continue;
				if (words[j].startsWith(words[k])) {
					return "No, "+k;
				}
			}
		}
		return "Yes";
	}
}
