/**
 * 
 */

/**
 * @author OM SAI
 *
 */
import java.util.Scanner;
public class program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("you are still a minor please grow up");
		}
			else if(age>65) {
				System.out.println("you are a senior citizen stop over expectations");
				
			}
			else {
				System.out.println("congratulations you are eligible groom");
			}
			
		}

	}


