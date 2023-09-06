package Class3;

import java.sql.SQLException;

class Parent {
	
	void show() throws SQLException, Exception{
		System.out.println("Parent Class Method");
	}
}

public class ExceptionhandlingRules extends Parent{
    @Override
    void show()throws Exception{
    	System.out.println("Child class method");
    }
	public static void main(String[] args) {
		

	}

}
