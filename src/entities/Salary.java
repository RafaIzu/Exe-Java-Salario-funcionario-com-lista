package entities;

public class Salary {
	private double salary;
	private int id;
	private String name;
	public Salary(double salary, int id, String name) {
		this.salary = salary;
		this.id = id;
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void increaseSalary(double percentage) {
		salary*=(percentage/100+1);
	}
	
	public String getString() {
		return id
				+", "
				+name
				+", "
				+String.format("%.2f", salary);
				
	}
	

}
