abstract class Rbi {
	protected int id;
	protected String name;
	protected int age;
	protected String dob;
	
	public Rbi(int id, String name, int age, String dob) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	
	abstract public void currentBalance();
}

class Sbi extends Rbi{
	private float balance;
	
	public Sbi(int id, String name, int age, String dob, float balance) {
		super(id, name, age, dob);
		this.balance = balance;
	}
	
	public void currentBalance() {
		System.out.println("Current Balance = "+balance);
	}
	
	public String toString() {
		return "Id = "+id+"\nName = "+name+"\nAge = "+age+"\nDob = "+dob;
	}
}

public class ObjectClassTest2 {
	public static void main(String[] args) {
		Sbi s1 = new Sbi(1, "Raj", 20, "10/05/2004", 12555);
		
		System.out.println(s1);
		s1.currentBalance();
	}
}