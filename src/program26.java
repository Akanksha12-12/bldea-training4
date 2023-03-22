/**
 * 
 */

/**
 * @author OM SAI
 *
 */
import java.util.Scanner;
public class program26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of classes");
		int c=sc.nextInt();
		System.out.println("enter the number of students");
		int s=sc.nextInt();
		int arr[][]=new int[c][s];
		for(int i=0;i<c;i++) {
		System.out.println("class number "+(i+1));
		for(int j=0;j<s;j++) {
			System.out.println("enter the marks of student"+(j+1));
			arr[i][j]=sc.nextInt();
		}
		

	}
		System.out.println("-----------");
		for(int i=0;i<c;i++) {
			System.out.println("class number"+(i+1));
			for(int j=0;j<s;j++) {
				System.out.println("the marks of student"+(j+1)+"is"+arr[i][j]);
			
				
			}

}
	}
}
