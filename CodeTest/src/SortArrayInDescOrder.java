import java.util.Arrays;

public class SortArrayInDescOrder {

	public static void main(String[] args) {
		int []  arr = {3,2,9,30,6,78};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			//temp=0;
		for( int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		
		}
		
	}
		System.out.println(Arrays.toString(arr));

	}
}
