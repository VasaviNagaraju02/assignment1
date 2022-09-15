package assignment1;

public class Ans {
	public void p1method() {
		System.out.println("this ia parent class");
	}
}
class Cclass extends Ans{
	public void cmethod() {
		System.out.println("this is child class");
	}
	}
class Ans1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ans m=new Ans();
Cclass n=new Cclass();
m.p1method();
n.cmethod();
n.p1method();
	}

}
