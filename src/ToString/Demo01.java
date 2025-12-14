package ToString;



class Employeeee51
{
	private int id;
	private String name;
	private int salary;


	public Employeeee51(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
}


public class Demo01 {
	
	public static void main(String[] args) {
		
		Employeeee51 e=new Employeeee51(1,"Tim",934989);
		System.out.println(e);	
		
		
		}

}
