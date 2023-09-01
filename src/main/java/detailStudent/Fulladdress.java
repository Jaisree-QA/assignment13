package detailStudent;

public class Fulladdress {
	String streetname,apartment;
	String city;
	int doorno;
	Student address;
	
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public Student getAddress() {
		return address;
	}
	public void setAddress(Student address) {
		this.address = address;
	}
	public static void main(String[] args) {
		Fulladdress z=new Fulladdress();
		z.setDoorno(92);
		z.setApartment("Flora");
		z.setCity("Naas");
		z.setStreetname("Arconagh");
	
		Student a=new Student();
		a.setStudent("Jhansi", 45);
		z.setAddress(a);
System.out.println("Name : "+z.getAddress().getname());
		
System.out.println("Roll no : "+z.getAddress().getrollno());
		System.out.println("Full Address : "+z.getDoorno());
		System.out.println("Apartment "+z.getApartment());
		System.out.println(""+z.getCity()+" "+z.getStreetname());
		

	}
}

