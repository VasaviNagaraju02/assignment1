package assignment1;
class I{
	int i;
	public void printNumber() {
		System.out.println(i);
	}
}
class J extends I{
	int j;
	public void printNumber() {
		System.out.println(j);
	}
}

public class Integer_Datamember {

	public static void main(String[] args) {
		J a=new J();
		a.i=12;
		a.j=7;
		a.j=a.i;
		a.printNumber();
	}

}
