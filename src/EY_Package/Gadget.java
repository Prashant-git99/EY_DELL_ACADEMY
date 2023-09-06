package EY_Package;

public class Gadget {
	int stId;
	String stName;
	double stSalary;
	String stDesignation;
	
	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}



	public void setStName(String stName) {
		this.stName = stName;
	}



	public double getStSalary() {
		return stSalary;
	}

	public void setStSalary(double stSalary) {
		this.stSalary = stSalary;
	}

	public String getStDesignation() {
		return stDesignation;
	}

	public void setStDesignation(String stDesignation) {
		this.stDesignation = stDesignation;
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Gadget st=new Gadget();
			st.setStId(123);
			st.setStName("Joseph");
			st.setStSalary(200000);
			st.setStDesignation("Manager");
			
			System.out.println("mera id hai "+st.getStId());
			System.out.println("mera name hai "+st.getStName());
			System.out.println("mera salary hai "+st.getStSalary());
			System.out.println("mera designation hai "+st.getStDesignation());
}
}
	

