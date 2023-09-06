package class_2;

public class instance_of {

	public static void main(String[] args) {
		instance_of obj = new instance_of();
		System.out.println(obj instanceof instance_of);
		obj = null;
		System.out.println(obj instanceof instance_of);

	}

}
