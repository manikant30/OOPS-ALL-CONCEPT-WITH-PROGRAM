package ENCAPSULATION1;

//POJO=PLAIN OLD JAVA OBJECT
//1.private member
//2.two constructor (i)zero parameterized constructor (ii) parameterized constructor 
//3.getter and setter

//these three are present in same class is called POJO class.


class Employee
{
	//private member
	private int id;
	private String name;
	private int salary;
	
	//zero parameterized constructor
	public Employee()
	{
		
	}

	//parameterized constructor
	public Employee(int id, String name, int salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	//getters
	public int getId() {
		return id;
	}
    
	//setters
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}

public class Demo12 {
	public static void main(String[] args)
	{
		
	}

}
