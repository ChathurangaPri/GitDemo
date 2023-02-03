package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("ddd");
		System.out.println(hs);
		
		hs.remove("bbb");
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.contains("aaa"));
		
		System.out.println(hs.size());
		
		Iterator<String> it = hs.iterator();
		
		System.out.println(it.next());
	}

}
