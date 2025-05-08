class Person {
	protected int id;
	protected String name;
	protected String post;
	protected float salary;
	
	public Person(int id, String name, String post, float salary) {
		this.id = id;
		this.name = name;
		this.post = post;
		this.salary = salary;
	}
	
	public String toString() {
		return "Id = "+id+"\nName = "+name+"\nPost = "+post+"\nSalary = "+salary;
	}
}

class Employee extends Person{
	
	public Employee(int id, String name, String post, float salary) {
		super(id, name, post, salary);
	}
}
public class ObjectClassTest1 {
	public static void main(String[] args) {
		Employee e = new Employee(1, "Shivam", "Java Developer", 15000);
		
		System.out.println(e.toString());
	}
}