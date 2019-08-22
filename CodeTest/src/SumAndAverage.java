
public class SumAndAverage {

	public static void main(String[] args) {
		int [] arr = {7,3,5,7,9,3,5};
		int sum=0;
		float avg=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			avg=(float) sum/arr.length;
			
		}
		System.out.println("sum is:"+sum);
		System.out.println("Average is:"+avg);
	}

}
