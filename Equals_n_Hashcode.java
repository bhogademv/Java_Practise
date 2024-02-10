import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

class Emplo
{
	String name;
	int age;
	String deptId;
	int salary;
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
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emplo [name=" + name + ", age=" + age + ", deptId=" + deptId + ", salary=" + salary + "]";
	}
	public Emplo(String name, int age, String deptId, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.deptId = deptId;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, deptId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplo other = (Emplo) obj;
		return age == other.age && Objects.equals(deptId, other.deptId) && Objects.equals(name, other.name)
				&& salary == other.salary;
	}
	
	
}
public class Equals_n_Hashcode {
static Emplo e1= new Emplo("john", 32, "dept1", 20000);
static Emplo e2= new Emplo("john", 32, "dept1", 20000);
static Emplo e3= new Emplo("john", 32, "dept1", 20000);
static Emplo e4= new Emplo("john", 32, "dept1", 20000);
	public static void main(String[] args) {
		HashMap<Emplo, String> hmap=new HashMap<>();
		hmap.put(e1, "first");
		hmap.put(e2,"second");
		hmap.put(e3,"Third");
		hmap.put(e4,"forth");
		
		System.out.println(hmap.size());
//4- without overirde hashcode      1- with override hashcode
//4- without EQ with hashcode  	    1- without EQ n hashcode                             	
	}

}
