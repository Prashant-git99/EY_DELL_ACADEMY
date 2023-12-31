package Class3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectData {                      //For reading only object we use input/output Stream
											// for reading normal "data" we use buffer reader/writer
	public static void main(String[] args) {
		
		String str = new String("String is a Immutable class");
		Integer i = new Integer(12345);
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/Files/ABC5.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("C:/Files/ABC6.txt"));
			
			oos.writeObject(str);
			oos.writeObject(i);
			
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Files/ABC5.txt"));
			System.out.println("String Data is "+ (String) ois.readObject());
			System.out.println("Integer Data is " +(Integer) ois.readObject());
			ois.close();			
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
