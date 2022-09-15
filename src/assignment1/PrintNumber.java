package assignment1;

public class PrintNumber {
	public int print(int a) {
		System.out.println(a);
		return a;
	}
	public float print(float b) {
		System.out.println(b);
		return b;
	}
	public double print(double c) {
		System.out.println(c);
		return c;
	}
	
	public String print(String d) {
		
			System.out.println(d);
			return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNumber a= new PrintNumber();
		PrintNumber b= new PrintNumber();
		        a.print("vasavi");
				a.print(9.23);
				a.print(2022);
				a.print(22);
	}

}
