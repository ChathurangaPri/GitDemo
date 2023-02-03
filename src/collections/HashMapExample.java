package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		
		hm.put(0, "hi");
		hm.put(1, "hello");
		hm.put(2, "he");
		
		System.out.println(hm.get(0));
		Set an = hm.entrySet();
		Iterator it = an.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
