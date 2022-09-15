package assignment1;

class Member {
	String name;
	int age;
	String number;
	String address;
	int salary;
	public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member{
	String specialization;
}
class Manager extends Member{
	String department;
	
	}
class Ofc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e =new Employee();
e.name="vasavi";
e.age=22;
e.number="9113034994";
e.address="Mysuru";
e.salary=23000;
e.specialization="java";

Manager m=new Manager();
m.name="Rekha";
m.age=30;
m.number="9448165910";
m.address="Trivandrum";
m.salary=30000;
//m.specialization="java";


	}

}
