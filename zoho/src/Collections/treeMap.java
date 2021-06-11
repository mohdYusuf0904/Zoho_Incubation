package Collections;

import java.util.TreeMap;

public class treeMap {
	
	
	
	public static void main(String[] args) {
		
		
		
		TreeMap<Integer,String> tm = new TreeMap<>(); 
		
		tm.put(23,"A");
		tm.put(42,"v");
		tm.put(23,"f");
		tm.put(34,"b");
		tm.put(45,"d");
		
		System.out.println(tm);
		System.out.println(tm.higherKey(45));
		System.out.println(tm.ceilingKey(33));
		System.out.println(tm.tailMap(33));
		System.out.println(tm.headMap(45));
		System.out.println(tm.subMap(2, 33));
	}

}
