/**
 * 
 */

/**
 * @author OM SAI
 *
 */
import java.util.Scanner;
public class program25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the marks of each student with number"+(i+1));
			arr[i]=sc.nextInt();
			
					
		}
		for(int i=0;i<n;i++) {
			System.out.println(" the marks of each student with number"+(i+1)+"is"+arr[i]);		

	}

}
}