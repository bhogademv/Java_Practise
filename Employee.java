

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	int id;
	String name;
	int age;
	Double salary;
	String dept;
	
	public Employee(int i, String string, int j, double d, String string2) {
		id=i;
		name=string;
		age=j;
		salary=d;
		dept=string2;
	}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public Double getSalary() {	return salary;}
	public void setSalary(Double salary) {this.salary = salary;}
	public String getDept() {return dept;}
	public void setDept(String dept) {this.dept = dept;}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
	List<Employee>	empList = new ArrayList<>();
	Double totalSalary=0d;
	
	empList.add(new Employee(4,"alok",42,1234d,"CSE"));
	empList.add(new Employee(2,"alok",21,1000d,"IT"));
	empList.add(new Employee(1,"smith",32,1335d,"CSE"));
	empList.add(new Employee(6,"karan",22,2000d,"IT"));
	empList.add(new Employee(3,"prakash",32,1633d,"HR"));
	empList.add(new Employee(5,"raju",24,2344d,"HR"));
	
	// add salary of all employees from "IT" dept
	totalSalary=empList.stream().filter(e -> e.getDept().equals("IT"))
								.mapToDouble(Employee::getSalary).sum();
	System.out.println("------ Total Salary: "+totalSalary);
	
	//sort employees by their name
	System.out.println("------ Sort by emp name: ");
	empList.stream().sorted((e1,e2)->e1.getName()
			.compareToIgnoreCase(e2.getName()))
			.forEach(s -> System.out.println(s.getName()));
	
	//sort employees by their Id
		System.out.println("------ Sort by emp Id: ");
	empList.stream().sorted(Comparator.comparingInt(e -> e.getId()))
					.forEach(System.out::println);
	
	//sort employees by their salary
	System.out.println("------ Sort by emp salary: ");
	empList.stream().sorted(Comparator.comparingDouble(e-> e.getSalary()))
					.forEach(System.out::println);
		
	// fetch the top 5 employees salaries  in IT department
	System.out.println("------ fetch the top 5 employees salaries  in IT department: ");
	List<Employee> depts= empList.stream()
			.filter(e->e.getDept().equals("IT")).collect(Collectors.toList());
		//	depts.stream().sorted((e1,e2) -> (int)(e2.getSalary()-e1.getSalary()))
		//			.limit(5).forEach(s->System.out.println(s));
	
	depts.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
	.limit(5).forEach(s->System.out.println(s));
	
	// sort using name then using Id
	System.out.println("------Method 1: sort using name then using Id");
	Collections.sort(empList, Comparator.comparing(Employee::getName)
			.thenComparing(Employee::getId));
	System.out.println(empList);
	
	System.out.println("------Method 2: sort using name then using Id");
	Comparator<Employee> byName=(x,y)->x.name.compareTo(y.name);
	Comparator<Employee> byId=(l,m)->Integer.compare(l.id, m.id);
	empList.stream().sorted(byName.thenComparing(byId)).forEach(System.out::println);
	
	System.out.println("------Find all employees whose id > 30 from Map");
	 Map<Integer, Employee> empMap = new HashMap<>();
	 for (Employee emp : empList) {
         empMap.put(emp.id, emp);
     }
	// Find all employees whose age > 30 and store them in a List
    List<Employee> filteredEmployees = empMap.values().stream()
            .filter(employee -> employee.age > 30)
            .collect(Collectors.toList());

    // Print the filtered employees
    filteredEmployees.forEach(employee -> System.out.println( employee.toString()));
	}
}
