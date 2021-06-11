package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Mapp {
	
	public void add() {
		
		
	}
	public static void main(String[] args) {
		
		String str = "Life Life is Like box of chocklates ";
			
		Map<Character ,Integer> map = new HashMap<>();
		Map<String,Integer> lmap = new LinkedHashMap<>();
		
		String s[]=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
		
			Integer intt = lmap.get(s[i]);			
			if(intt==null)
			lmap.put(s[i],1);
			else
			lmap.put(s[i],intt+1);
		
		}
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==' ')
			continue;
			
			Integer intt = map.get(str.charAt(i));
		
			if(intt==null)
			map.put(str.charAt(i),1);
			else
			map.put(str.charAt(i),intt+1);
			
		}
		
		System.out.println(map);
		//System.out.println(lmap);
	}
	
}
