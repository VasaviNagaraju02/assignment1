package assignment1;

public class Twod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int[][] matrix= {{1,2,3,},{4,5,6},{7,8,9}
};
for(int i=0;i<matrix.length;i++)
{
	for(int j=0;j<matrix[i].length;j++) {
		System.out.print(matrix[i][j]+"");
	}
	System.out.println();
}
	}

}