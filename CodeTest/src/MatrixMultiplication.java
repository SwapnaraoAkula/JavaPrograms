
public class MatrixMultiplication {

	public static void main(String[] args) {
		int matrix1[][] = {{1,1},{2,2}};
		int matrix2[][] = {{2,2},{3,3}};
		int matrix3[][]= new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
				matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
			}
		}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();

		}
		
	}

}
