import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter arr1 size:");
		int arr1size=sc.nextInt();
		System.out.println("enter arr2 size:");
		int arr2size=sc.nextInt();
		int [] arr1 = new int[arr1size];
		int [] arr2 = new int[arr2size];
		int arr3size=arr1size+arr2size;		
		System.out.println("arr3 size is:"+arr3size);

		int [] arr3 = new int[arr3size];
		System.out.println("enter elts of arr1:");
		for(int i=0;i<arr1size;i++) {
			arr1[i]=sc.nextInt();
		}
//		for(int i:arr1) {
//			System.out.println(i);
//		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("enter elts of arr2:");
		for(int i=0;i<arr2size;i++) {
			arr2[i]=sc.nextInt();
		}
//		for(int i:arr2) {
//			System.out.println(i);
//		}
		System.out.println(Arrays.toString(arr2));

		for(int i=0;i<arr1size;i++) {
			arr3[i]=arr1[i];
			
		}
		for(int i=0,k=arr1size;i<arr2size && k<arr3size;i++,k++) {
			arr3[k]=arr2[i];
			
		}
		System.out.println(Arrays.toString(arr3));


	}

}
