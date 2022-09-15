package assignment1;
class Degree{
	public void gerDegree() {
		System.out.println("I got a degree");
	}
}
class Undergraduate extends Degree{
	public void getDegree() {
		System.out.println("i am an udergraduate");
	}
	}
class Postgraduate extends Degree{
	public void getDegree() {
		System.out.println("i am a postgraduate");
	}
}

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Undergraduate a=new Undergraduate();
Postgraduate b= new Postgraduate();
a.getDegree();
b.getDegree();
	}

}
