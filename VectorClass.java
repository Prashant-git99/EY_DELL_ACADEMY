package Class_5;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		//10 is initial capacity and 5 is load factor
		Vector<String> vec = new Vector<>(10,5);
		
		vec.addElement("Z");vec.addElement("Z");vec.addElement("Y");vec.addElement("Z");
		vec.addElement("A");vec.addElement("X");vec.addElement("B");
		vec.addElement("P");vec.addElement("P");vec.addElement("R");
		vec.addElement("M");
		
		System.out.println("Size of vector is " + vec.size());
		System.out.println("Cpacity of vector is " + vec.capacity());
		
		Enumeration<String>en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement() + " ");
		}

	}

}
