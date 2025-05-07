public class ArrayKata {

// number 1
	/**public static String maximumIn(int[] numbers) {

	if (numbers == null || numbers.length == 0) {
	return null;
}
	
	int maximumNumber = numbers[0];

	for (int count = 1; count < numbers.length; count++) {
        if (numbers[count] > maximumNumber) {
        maximumNumber = numbers[count];
}
}
    return "The largest number in the array is: " + maximumNumber;
}

// number 2
	public static String minimumIn(int[] numbers){

	if (numbers == null || numbers.length == 0) {
	return null;
}
	int maximumNumber = numbers[1];
	int indexOfMax = 0;

	for (int count = 1; count < numbers.length; count++) {
        if (numbers[count] > maximumNumber) {
        maximumNumber = numbers[count];
	indexOfMax = count;
}	
}
	return "The smallest number in the array is: " + indexOfMax;
}

// number 3
	public static String sumOf(int[] numbers) {
		
	int total = 0;
	for(int number : numbers) {
	total += number;
}
	return "The sum of array is: " + total;
}

// number 4
	public static String sumOfEvenNumbersIn(int[] numbers) {
	int evenSum = 0;
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] % 2 == 0) {
		evenSum += numbers[count];
}
}
		return "Sum of even numbers is: " + evenSum;
}**/

// number 5
	public static String sumOfOddNumbersIn(int[] numbers) {
	int oddSum = 0;
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] % 2 != 0) {
		oddSum += numbers[count];
}
}
		return "Sum of odd numbers is: " + oddSum;
}

// number 6
	public static String maximumAndMinimumOf(int[] numbers) {

	if (numbers == null || numbers.length == 0) {
	return null;
}
	
	int maximumNumber = numbers[0];

	for (int count = 1; count < numbers.length; count++) {
        if (numbers[count] > maximumNumber) {
        maximumNumber = numbers[count];
}
}
    return "The largest number in the array is: " + maximumNumber;
}

// number 7
// number 8
// number 9
// number 10
// number 11






}