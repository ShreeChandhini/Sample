package collection;

public class Employee {
	
	private int id;
	private String name;
    private int age;
    private String department;
    private double salary;
    
	public Employee(int id, String name, int age, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", salary="
				+ salary + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getDepartment()=" + getDepartment() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Id:" +id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary:" + salary);
    }
    
    
    public static void main(String[] args) {

        Employee emp = new Employee(1234,"Sri", 21, "Software Developer", 85000);
        
        emp.displayDetails();
        
        emp.setId(1128);
        emp.setName("Chandhini");
        emp.setAge(28);
        emp.setDepartment("Senior Developer");
        emp.setSalary(95000);
        
      
        emp.displayDetails();
    }
	
	

}
