package assignment1;
class BaseClass{
	void display()
	{
		System.out.println("BaseClass::Display with'default'scope");
	}
}

class Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BaseClass obj=new BaseClass();
obj.display();

	}

}
