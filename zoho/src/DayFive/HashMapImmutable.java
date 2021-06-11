package DayFive;

import java.util.*;

public class HashMapImmutable {

	//beware of hashcode and equals
	static float i;
	public static void main(String[] args) {
	
		System.out.println(i);
		
		
		Long i = 45l;
		for(long c=0;c<i.MAX_VALUE;c++) {
			
			
			Integer v=Integer.valueOf("128");
		}
		
		/*
		 * 
		 * Map<List<String>,Integer> map = new HashMap<>(); List<String> st = new
		 * ArrayList<>(); map.put(st, 1); System.out.println(map.get(st));
		 * st.add("yusuf"); System.out.println(map.get(st));
		 * 
		 * 
		 * Map<person,Integer> m = new HashMap<>(); person p = new person();
		 * m.put(p,25);
		 * 
		 * p.setName("yusuf");
		 * 
		 * System.out.println(m.get(p));
		 * 
		 */	}
}

class person{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}