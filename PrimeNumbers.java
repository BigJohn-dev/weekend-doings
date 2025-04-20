import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a positive integer: ");
	double num = input.nextDouble();

	if (num < 0){
	System.out.println("Only positive integers. Try again!!");
}
	if (num / 1 == num || num / num == 1) {
	System.out.println("You've entered a prime number.");
}	


}

}

	

