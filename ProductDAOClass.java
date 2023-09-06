package Class_11;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//POJO

class Product1 {
	int Product1_id;
	String prod_name;
	String prod_desc;
	int prod_quantity;
	double prod_price;
	LocalDate prodValidity;
	public LocalDate getProdValidity() {
		return prodValidity;
	}
	public void setProdValidity(LocalDate prodValidity) {
		this.prodValidity = prodValidity;
	}

	Product1() {
	}

	Product1(int Product1_id, String prod_name, String prod_desc,
			int prod_quantity, double prod_price, LocalDate prodValidity) {
		this.Product1_id = Product1_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_quantity = prod_quantity;
		this.prod_price = prod_price;
		this.prodValidity = prodValidity;
	}

	public int getProduct1_id() {
		return Product1_id;
	}

	public void setProduct1_id(int Product1_id) {
		this.Product1_id = Product1_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public int getProd_quantity() {
		return prod_quantity;
	}
	public void setProd_quantity(int prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public double getProd_price() {
		return prod_price;
	}

	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}
}
interface Product1DAO1 {
	String nameOFProduct1(Product1 p);
	int priceOfProduct1(Product1 p);
	int quantityOfProduct1(Product1 p);
	String descriptionOfProduct1(Product1 p);
	LocalDate prodValidityDate(Product1 p);
	void deleteProduct1(Product1 p);
	List<Product1> getAllProduct1();
}

class Product1DAOImp1 implements Product1DAO1 {
	List<Product1> listOfProduct1s = new ArrayList<>();
	public Product1DAOImp1() {
		Product1 p1 = new Product1(123, "A", "B", 10, 10.29, LocalDate.now());
		Product1 p2 = new Product1(124, "C", "D", 20, 20.29, LocalDate.of(2019, Month.FEBRUARY, 20));
		listOfProduct1s.add(p1);
		listOfProduct1s.add(p2);
	}

	@Override

	public String nameOFProduct1(Product1 p) {
		Iterator<Product1> itr = listOfProduct1s.iterator();
		while (itr.hasNext()) {
			Product1 p2 = itr.next();
            if(p2.getProd_name().equalsIgnoreCase(p.getProd_name())) {
			return p2.getProd_name();
           }
		}
		return null;
	}

	@Override
	public int priceOfProduct1(Product1 p) {
		return 0;
	}

	@Override
	public int quantityOfProduct1(Product1 p) {
		return 0;

	}
	@Override
	public String descriptionOfProduct1(Product1 p) {
		return null;
	}

	@Override
	public LocalDate prodValidityDate(Product1 p) {
		return null;
	}

	@Override
	public void deleteProduct1(Product1 p) {
		listOfProduct1s.remove(p);
	}

	@Override
	public List<Product1> getAllProduct1() {
		return listOfProduct1s;
	}
}

public class Product1DAOClass {
	public static void main(String[] args) {
		Product1DAOImp1 obj = new Product1DAOImp1();
		for (Product1 p : obj.getAllProduct1())
		{
			System.out.println("Product1 Id " + p.Product1_id + "Product1 name is " + p.prod_name);
			System.out.println("Name of the Product1 is " + p.getProd_name());
			obj.deleteProduct1(p);
			obj2.afterDeleteProduct1s();
		}
	}
	static void afterDeleteProduct1s() {
		Product1DAOImpl obj = new Product1DAOImpl();
		if(null != obj.getAllProduct1s()) {
			System.out.println("Product1 id " + p.Product1_id + "Product1 name is " + p.prod_name);
			System.out.println("Name of Product1 is " + p.getProd_name());
		}
	}else {
		System.out.println("List is empty");
	}
}