package assignment1;
class Area
{
	public void ar(int a)
	{
		System.out.println("are of square ="+(a*a));
		
	}
	public void ar(int a,int b)
	{
		System.out.println("area of rectangle= "+(a*b));
	}
}

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Area a =new Area();
a.ar(2,3);
a.ar(2);
	}

}
