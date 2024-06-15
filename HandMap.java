package collection;

import java.util.HashMap;

public class HandMap {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1,"Sri");
		hm.put(2,"Chandhini");
		hm.put(3,"diya");
		for(Integer x:hm.keySet()) {
			System.out.println(x);
		}
		for(String y:hm.values()) {
			System.out.println(y);
		}
		hm.forEach((x,y)->System.out.println(x+""+y));
		hm.keySet().forEach(x->System.out.println(x));
	}

}
