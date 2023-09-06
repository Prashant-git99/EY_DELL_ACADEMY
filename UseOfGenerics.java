package Class_6;

class MyGeneralizedClass<T>{
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}

public class UseOfGenerics {

	public static void main(String[] args) {
		MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
		intType.add(21);
		intType.add(31);
		//intType.add("ABC"); //COMPILE TIME ERROR WILL COME if i try to add
		//any other data apart from integer
		
		System.out.println(intType.get());
		MyGeneralizedClass<String> strType = new MyGeneralizedClass<>();
		strType.add("Hello");
		//intType.add("31"); //COMPILE TIME ERROR WILL COME if i try to add
		//ANY OTHER DATA APART FROM STRING
		
		System.out.println(strType.get());
		
		MyGeneralizedClass<Boolean> boolType = new MyGeneralizedClass<>();
		boolType.add(true);
		//intType.add("31"); //COMPILE TIME ERROR WILL COME if i try to add
		//ANY OTHER DATA APART FROM boolean
		
		System.out.println(boolType.get());
		
		
		
		

	}

}
