package Assignment;
import java.util.Scanner;

public class VoteAge {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int age=obj.nextInt();
		if(age>=18) {
			System.out.println("you are eligible to vote");
		}
		else {
			System.out.println("you are not eligible to vote");
		}
	}

}
