package EY_Package;

public class VariableInitialization_Constructor {
	
	int number;
	
	//no argument const.
	VariableInitialization_Constructor(){
		number = 100;
	}
	VariableInitialization_Constructor(int number){
		
		this.number = number;
	}
	
	public static void main(String[] args) {
		
		VariableInitialization_Constructor obj = new VariableInitialization_Constructor();
		System.out.println("The value of the number is " + obj.number);
		
		VariableInitialization_Constructor obj2 = new VariableInitialization_Constructor();
		System.out.println("The value of the number is " + obj2.number);
		

	}

}
