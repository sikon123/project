package nnnn;

import java.util.ArrayList;
import java.util.function.Predicate;


class Student
{
	String name;
	int age;
	String address;
	String dept;
	public Student(String name, int age, String address, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", dept=" + dept + "]";
	}
	
	public boolean equals(Object obj)
	{
		Student s=(Student)obj;
		if(name.equals(s.name) && age==s.age && address.equals(s.address) && dept.equals(s.dept))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	}
	

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student> list=new ArrayList<Student>();
		
		populate(list);
		
		Predicate<Student>p1=s->s.dept.equals("CSE");
		System.out.println("dept information");
		display(p1,list);
		
	
	}

	public static void display(Predicate<Student> p, ArrayList<Student> list) {
		// TODO Auto-generated method stub
		
		for(Student s1:list)
		{
			if(p.test(s1))
			{
				System.out.println(s1);
			}
		}
	}

	public static void populate(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		
		  list.add(new Student("Sikon",20,"bbsr","CSE"));
		
		  list.add(new Student("raja",18,"ctc","mech"));
		  list.add(new Student("Nihar",19,"blr","EE"));
		  list.add(new Student("ram",22,"hyd","EEE"));
		  list.add(new Student("somen",26,"sgr","diploma"));
		  list.add(new Student("Hari",32,"btm","B.phrma"));
		  list.add(new Student("ajay",27,"turtol","m.phrma"));
		
		
	}
	
	
		
	}

