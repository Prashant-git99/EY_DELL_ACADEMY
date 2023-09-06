package Class_5;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(123, "ABC");
		hMap.put(123, null); //2nd record with same key will override first record
		hMap.put(123, null);
		hMap.put(null, "PQR");
		hMap.put(null, "XYZ");
		hMap.put(133, "MNO");
		
		//this is how we traverse Map
		for (Map.Entry<Integer, String> m: hMap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
			
		}

	}

