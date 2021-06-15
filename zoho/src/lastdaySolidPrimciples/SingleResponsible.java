package lastdaySolidPrimciples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SingleResponsible {
	
	
	public static void main(String[] args) {
		
		StoreUserDb userD =  new User();
		userD.signup("yusuf", "21", "mafyusuf420", "pass420");
		userD = userD.login("mafyusuf420","pass420");
		
		Date d = new Date();
		d.setDate(14);
		d.setMonth(06);
		d.setYear(2021);
		Billing bill = new BillingFunction("watch",2540,d);
		FlipkartShop user1 = new FlipkartShop(bill,userD);
		System.out.println(user1.getBill());
		user1.userDetails();
	}

	
	
}




class FlipkartShop{
	
	Billing b;
	StoreUserDb user;
	
	public FlipkartShop(Billing b, StoreUserDb user) {
		
		super();
		this.b = b;
		this.user = user;
	}
	
	public String getBill() {
	
		return b.bill();
	}
	
	public void userDetails()
	{	
		user.userData();
	}

	

}
interface StoreUserDb{
	
	void userData();
	User login(String email,String password);
	User signup(String name,String age,String email,String password);
}

interface Billing{
	
	String bill();
}


class User implements StoreUserDb{
	
	private String name;
	private String age;
	private String emailid;
	private String passsword;
	List<User> user = new ArrayList<>();
	
	
	public User() {
		
	}
	
	private User(String name, String age, String emailid, String passsword) {
		
		this.name = name;
		this.age = age;
		this.emailid = emailid;
		this.passsword = passsword;
	}



	public User login(String email, String passwordd) {
		

		for(int i=0;i<user.size();i++)
		{
			if(user.get(i).emailid.equals(email) &&
					user.get(i).passsword.equals(passwordd)) {
				
				return user.get(i);
			}
		}
		return null;
	}

	
	public User signup(String name, String age, String email, String password) {
		
		User u = new User(name,age,email,password);
		user.add(u);
		return u;
	}
	
	public void userData() {
		
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", emailid=" + emailid;
	}
	
	
	
}


class BillingFunction implements Billing{

	private String name;
	private double price;
	private Date date;
	
	
	
	
	public BillingFunction(String name, double price, Date date) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
	}



	@Override
	public String bill() {
		
		int year = date.getYear()+1;
		String s = "product name : "+ name +"\nprice: "
		+price+"\ndate:"+date;
		date.setDate(year);
		s+="\n Expired date: "+date;
		
		return s;
	}



	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}




	public Date getDate() {
		return date;
	}



	@Override
	public String toString() {
		return "BillingFunction [name=" + name + ", price=" + price + ", date=" + date + "]";
	}

	


}


