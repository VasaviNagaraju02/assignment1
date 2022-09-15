package assignment1;

public class Modifiers {
	protected String fname="Vasavi";
	protected String lname="Kashyap";
	protected String mail="vasu@gmail.com";
	protected int age=22;
}
class Protected extends Modifiers{
	private String place="Mysuru";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected myObj= new Protected();
		System.out.println("name:"+myObj.fname+""+myObj.lname);
		System.out.println("mail:"+myObj.mail);
		System.out.println("age"+myObj.age);
		System.out.println("place"+myObj.place);

	}

}
