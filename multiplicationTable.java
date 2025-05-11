public class multiplicationTable {

	public static int multiplicationOf(int a, int b) {

	if(a < 0 || b < 0) {
	return 0;

}	else {
	int counter;
	for (counter = a; counter <= b; counter++) {
		for(int count = a; count <= b; count++) {
		System.out.print(counter * count + "  ");
}
	System.out.println();
}

	return counter;
}


}
}



      