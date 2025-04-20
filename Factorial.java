import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int factorial = 1;

	System.out.print("Enter any number: ");
	int number = input.nextInt();

	if (number < 0) {
	System.out.println("Invalid input");

}	else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
}
	 System.out.println("The factorial of " + number + " is " + factorial);
	}


}

}