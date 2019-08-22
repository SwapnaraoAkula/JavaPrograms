import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int [] array = new int[size];

		System.out.println("enter elts of array:");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(array));

		System.out.println("enter array element to be deleted:");
		int elt=sc.nextInt();
		System.out.println("array without deleted element:");
		for(int i=0;i<size;i++)
		{
		if(array[i]==elt) {
			continue;			
			}
		System.out.println(array[i]);

		
		}
	}

}
