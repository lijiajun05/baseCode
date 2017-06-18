package conllection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapQ {

	public static void main(String[] args) {
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put(1, "a");
		hashMap.put(2, new String("abc"));
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(123);
		arrayList.add("123");
		hashMap.put(3, arrayList);
		Set<Entry<Object, Object>> entrySet = hashMap.entrySet();
		Iterator<Entry<Object, Object>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<Object, Object> next = iterator.next();
			System.out.println(next);
		}
		hashMap.clear();
		System.out.println(hashMap);
		
		
		hashMap.put(1, 1);
		System.out.println(hashMap);
		
	}

}
