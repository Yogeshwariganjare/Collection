package Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Program9 {
	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){System.out.println("Choose option:");
		System.out.println("1.ID|2.Name|3.Department|4.Salary");
		int choose=sc.nextInt();
		TreeSet<Employee> emp=null;
		switch(choose)
		{
			case 1: emp=new TreeSet<Employee>(new IdComp());
					break;
			case 2: emp=new TreeSet<Employee>(new NameComp());
					break;
			case 3:	emp=new TreeSet<Employee>(new DeptComp());
					break;
			case 4: emp=new TreeSet<Employee>(new SalComp());
					break;
			default:System.out.println("Invalid Option");
		}
		emp.add(new Employee(10,"ABC","IT",32000));
		emp.add(new Employee(11,"PQR","Assistance",8500));
		emp.add(new Employee(12,"STW","HR",96500));
		emp.add(new Employee(13,"YWX","Assistance",8600));
		emp.add(new Employee(14,"ZXY","MANAGEMENT",2100));
		emp.add(new Employee(16,"HRD","Training",8900));
		emp.add(new Employee(15,"KJH","Assistance",6700));
		emp.add(new Employee(19,"JUY","Assistance",2200));
		emp.add(new Employee(17,"NGF","Assistance",7600));
		emp.add(new Employee(18,"SDE","Assistance",6700));
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}} 
	}

}

class IdComp implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class NameComp implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}
class DeptComp implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
}
class SalComp implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class Employee{
	
	int id;
	String name;
	String department;
	int salary;
	
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}


