package Test;

public class User {
	
	String test;
	private String name;
	private String city;
	private double salary;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", city=" + city + ", salary=" + salary + ", id=" + id + "]";
	}
	
	
	

}
