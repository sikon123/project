package nnnn;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String name;
	String designation;
	int age;
	double salary;
	public Employee(String name, String designation, int age, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		
		Employee e=(Employee)obj;
		
		if(name.equals(e.name) && designation.equals(e.designation) && age==e.age && salary==e.salary)
		{
			
			return true;
			
	}
		else 
		{
			return false;
		}
	
	}
	
}
 class Demo
 {
	public static void main (String[] args)
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		populate(list);
		
		Predicate<Employee> p1=emp->emp.designation.equals("Manager");
		System.out.println("manager information");
		display(p1,list);
		System.out.println("----------------------------------------");
		
		Predicate<Employee>p2=emp->emp.age>=40;
		System.out.println("promote him");
		display(p2,list);
		System.out.println("----------------------------------------");
		
		Predicate<Employee>p3=emp->emp.salary<20000;
		System.out.println("the employee whose salary<20000 give increment");
		display(p3,list);
		System.out.println("----------------------------------------");
		
		System.out.println("all manager from banglore city ");
		display(p1.and(p2), list);
		System.out.println("----------------------------------------");
		
		System.out.println("employee information whos are either manager or salary>30000 ");
		display(p1.or(p3), list);
		System.out.println("----------------------------------------");
		
		System.out.println("employee information whos are not anagers");
		display(p1.negate(),list);
		System.out.println("----------------------------------------");
		
		Predicate<Employee> isCEO=Predicate.isEqual(new Employee("sikon","CEO",20,60000));
		Employee e1=new Employee("sikon","CEO",20,60000);
		Employee e2=new Employee("somen","Lead",35,30000);
		
		System.out.println(isCEO.test(e1));
		System.out.println(isCEO.test(e2));
		System.out.println("----------------------------------------");
	}

	

	public static void populate(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		
		list.add(new Employee("sikon","CEO",20,60000));
		list.add(new Employee("raja","Manager",25,35000));
		list.add(new Employee("somen","Lead",35,30000));
		list.add(new Employee("dona","developer",45,25000));
		list.add(new Employee("ram","lead",32,45000));
		list.add(new Employee("sam","developer",42,15000));
		list.add(new Employee("ganesh","hr",40,45000));
		list.add(new Employee("sushree","developer",31,27000));
		list.add(new Employee("sonam","lead",27,32000));
		list.add(new Employee("bikash","developer",24,16000));
		
		
	}
	
	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		for(Employee e:list)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
			
		}
	}
 }
	
	
	
	

		
		
	


