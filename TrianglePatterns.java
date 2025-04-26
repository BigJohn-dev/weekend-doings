<<<<<<< HEAD
public class TrianglePatterns {
	public static void main(String[] args) {

	int a = 10;
	for (int b = 1; b <= a; b++) {
		for (int c = 1; c <= b; c++) { 
		System.out.print("* ");
	}
	System.out.println();
}

	for (int b = 1; b <= a; b++) {
		for (int c = b; c <= a; c++) {
		System.out.print("* ");
	}
	System.out.println();
}

	for (int b = 1; b < a; b++) {
		for (int c = 1; c < b; c++) {
		System.out.print("  ");
	}
		for (int d = b; d <= a; d++) {
		System.out.print(" *");
	}

	System.out.println();
}
	
	for (int b = 1; b <= a; b++) {
		for (int c = b; c <= a; c++) {
		System.out.print("  ");
	}
		for (int c = 1; c <= b; c++) {
		System.out.print("* ");
	}

	System.out.println();
}




}


=======
public class TrianglePatterns {
	public static void main(String[] args) {

	int a = 10;
	for (int b = 1; b <= a; b++) {
		for (int c = 1; c <= b; c++) { 
		System.out.print("* ");
	}
	System.out.println();
}

	for (int b = 1; b <= a; b++) {
		for (int c = b; c <= a; c++) {
		System.out.print("* ");
	}
	System.out.println();
}

	for (int b = 1; b <= a; b++) {
		for (int c = 1; c < b; c++) {
		System.out.print(" ");
	}
		for (int d = b; d < a; d++) {
		System.out.print("* ");
	}

	System.out.println();
}
	
	for (int b = 1; b <= a; b++) {
		for (int c = b; c <= a; c++) {
		System.out.print("  ");
	}
		for (int c = 1; c <= b; c++) {
		System.out.print("* ");
	}

	System.out.println();
}




}


>>>>>>> 44b41c460fefc3f632c077ca5fbf018456b7c493
}