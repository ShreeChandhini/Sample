package collection;

public class Student {
	
	private int id;
	private String name;
	private String gender;
    private String section;
    private int age;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int id, String name, String gender, String section, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.section = section;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", section=" + section + ", age=" + age
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getGender()=" + getGender()
				+ ", getSection()=" + getSection() + ", getAge()=" + getAge()  + "]";
	}
    
    
}