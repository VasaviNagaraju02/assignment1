package assignment1;

class Shap {
	public void print_shape() {
		System.out.println("this is ahape");
	}
	}
class Rectang extends Test{
	public void print_rect() {
		System.out.println("this is rectangular shape");
	}
	}
class Cricle extends Test{
	public void print_circle() {
		System.out.println("thus is circular shape");
	}
	}
class Squa extends Rectang{
	public void print_square() {
		System.out.println("Square is a raectangle");
	}
	}
	
 public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Squa sq= new Squa();
sq.print_square();
sq.print_square();

	}

}
