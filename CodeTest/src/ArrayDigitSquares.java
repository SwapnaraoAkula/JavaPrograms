
public class ArrayDigitSquares {

	public static void main(String[] args) {
		int [] arr = {2,7,9,3,5};
		int sum=0;
		int [] arrSquares=new int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			arrSquares[i]=arr[i]*arr[i];
			sum=sum+arrSquares[i];
		}
		for(int i:arrSquares)
		{
			System.out.print(i);
			System.out.print(" ");

		}
		System.out.println("sum of square of array is:"+sum);

	}

}
