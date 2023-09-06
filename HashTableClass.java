package Class_5;

import java.util.Hashtable;
import java.util.Map;

 

public class HashTableClass {
    public static void main(String[] args) {

        Hashtable<Integer,String> hMap=new Hashtable<>();
        hMap.put(123, "ABC");
      //hMap.put(123,null); 
      		//hMap.put(123, b3);
      		//hMap.put(null, b2);
      		//hMap.put(null, b3); 
        hMap.put(135, "MNO");
      //this is how we traverse map
        hMap.remove(135);

        for(Map.Entry<Integer, String> m:hMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
		

