package Class3;

public class HandlingMultipleExceptionsUsingSingleCatchBlock {

	public static void main(String[] args) {
		 try {
			 HandlingMultipleExceptionsUsingSingleCatchBlock obj = new
					 HandlingMultipleExceptionsUsingSingleCatchBlock();
		 }catch(NullPointerException | ArithmeticException | IndexOutOfBoundsException e) {
			 System.out.println(e.getMessage());
		 }

	}

}
