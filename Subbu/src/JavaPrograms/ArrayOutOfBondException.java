package JavaPrograms;

public class ArrayOutOfBondException {

	public static void main(String[] args) {
		
		try {
		int [] A = new int [3];
		
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		//A[3] = 40;
		
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		System.out.println(A[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of range");
		}
		int X = 100;
		int Y = 200;
		
		System.out.println(X+Y);
	}

}
