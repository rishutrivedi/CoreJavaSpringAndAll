package daysix.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> hm= new HashMap<String,Double>();
		hm.put("Rishu",22.3);
		hm.put("prabhat",99.42);
		hm.put("Rishu",24.3);
		hm.put("shivam",26.33);
		hm.put("sachin",28.56);
		hm.put("vaibhav",29.65);
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.get("shivam"));
		System.out.println("************************************************");
		Set set=hm.entrySet();
		System.out.println(set);
		System.out.println("**********************line2**************************");
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String,Double> me=(Map.Entry<String,Double>)itr.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		System.out.println("**********************line3**************************");
		Set <String> keys=hm.keySet();
		for(String key :keys) {
			System.out.println(key+":"+hm.get(key));
		}
	}

}
