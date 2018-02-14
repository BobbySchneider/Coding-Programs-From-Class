import java.util.*;

public class LeafTrails {
	public String[] trails(TreeNode t) {
		TreeMap<Integer,String> map = new TreeMap<>();
		doWork(t,map,"");
		String[] ret = new String[map.size()];
		int index = 0;
		for(int key : map.keySet()) {
			ret[index] = map.get(key);
			index++;
		}
		return ret;
	}
	public void doWork(TreeNode tree, TreeMap<Integer,String> map,String path) {
		if (tree == null) return;
		if (tree.left == null && tree.right == null) {
			map.put(tree.info, path);
			return;
		}
		doWork(tree.left,map,path+"0");
		doWork(tree.right,map,path+"1");
	}
}
