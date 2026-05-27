import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// Scanner Class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's Your name?");
		
		String name = sc.nextLine();
		System.out.printf("Hey  %s , How are you? " , name);
		String Status = sc.nextLine();
		System.out.println("What's your age?");
		int age = sc.nextInt();
		System.out.println("Thank you for your Information");
		
		

	}

}
