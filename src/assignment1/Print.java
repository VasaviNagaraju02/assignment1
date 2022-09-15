package assignment1;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Print obj=new Print();
obj.printn(10,'A');
obj.printn('B',5);
	}
	void printn(int a,char c) {
		System.out.println("Integer is "+a+"\tChar is :"+c);
	}
	void printn(char c,int a) {
		System.out.println("Chari s:"+c+"\tInteger is :"+a);
	}

}
