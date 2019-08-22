
public class DiffBetMinAndMax {

	public static void main(String[] args) {
		int [] arr = {2,4,3,8,9,5,2};
		int min=arr[0];
		int max=arr[0];
		int diff;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}

			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("maximum number in array is:"+max);
		System.out.println("minimum number in array is:"+min);
		diff=(max-min);
		System.out.println("Difference between maximum number and minimum number is:"+diff);

		
	}

}
