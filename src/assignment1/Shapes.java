package assignment1;

class Rectangle {
	int length;
	int breadth;
	public Rectangle(int i,int b) {
		length=i;
		breadth=b;
	}

	public void printArea() {
		System.out.println(length*breadth);
	}
	public void printPerimeter() {
		System.out.println(2*(length+breadth));
	}
	}
class Square extends Rectangle{
	int side;
	public Square(int s) {
		super(s,s);
	}
}
class Shapes{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r= new Rectangle(4,5);
r.printArea();
r.printPerimeter();
Square[] a=new Square[10];
int k=5;
for(int i=0;i<10;i++) {
	a[i]= new Square(k);
	k++;
}
for(int i=0;i<10;i++) {
	a[i].printArea();
	a[i].printPerimeter();
}
	}

}
