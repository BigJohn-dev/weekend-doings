public class Kata {

//number 1
	/**public static boolean evenAndOddNumberChecker(int number) {
	if (number % 2 == 0) {
	return true;
}
	return false;
}

//number 2
	public static boolean isPrimeNumber(int number) {

	if (number <= 1) {
        return false;
}
    	if (number == 2) {
        return true;
}
    	if (number % 2 == 0) {
        return false;
}
	return true;
}


//number 3
	public static int subtractionOfInteger(int number1, int number2) {
	int difference = Math.abs(number1 - number2);
	return difference;
}

//number 4
	public static int divisionOfInteger(int number1, int number2) {
	if (number2 == 0) {
	int ans = 0;
	return ans;
}
	int divide = number1 / number2;
	return divide;
}**/

//number 5
	public static int factorOfInteger(int number) {
	int count = 0;
	if (number <= 0) {
	return 0;
}
	if (number == 1) {
	count = count + 1;
}
	return count;
}

//number 6
	/**public static int squareOfInteger(int number) {
	int square = number * number;
	return square;
}
	

//number 7
	public static int isPalindrome(int number) {
	int square = number * number;
	return square;


//number 8
	public static long factorialOfInteger(int number) {
	if (number == 0 || number == 1) {
	return 1;

}	else {
	int result = number * Factorial(number - 1);
	return result;
}
	
}

//number 9
	public static int squareOfInteger(int number) {
	int square = number * number;
	return square;
}**/



}