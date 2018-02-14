import java.util.*;

public class FriendScore {
	public int highestScore(String[] friends) {
		ArrayList<Set<Integer>> data = new ArrayList<>();
		for(String s : friends) {
			Set<Integer> set = new HashSet<>();
			data.add(set);
			for(int k=0; k < s.length(); k++) {
				if (s.charAt(k) == 'Y') {
					set.add(k);
				}
			}
		}
		int max = 0;
		for(int r=0; r < data.size(); r++) {
			int xx = twoFriends(r,data);
			if (xx > max) {
				max = xx;
			}
		}
		return max;
	}

	private int twoFriends(int index, ArrayList<Set<Integer>> data) {
		Set<Integer> all = new HashSet<>();
		all.addAll(data.get(index));
		for(int direct : data.get(index)) {
			all.addAll(data.get(direct));
		}
		all.remove(index);
		return all.size();
	}
}
