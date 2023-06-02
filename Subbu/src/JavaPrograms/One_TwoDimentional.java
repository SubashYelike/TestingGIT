package JavaPrograms;

public class One_TwoDimentional {

	public static void main(String[] args) {
	
        int [] A = new int[5];
		
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		A[4] = 50;
		
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		

        int [][] X = new int[2][3];
		
		X[0][0] = 10;
		X[0][1] = 20;
		X[0][2] = 30;
		X[1][0] = 40;
		X[1][1] = 50;
		X[1][2] = 60;
		
		System.out.println(X[0][2]);
		System.out.println(X[1][1]);
		System.out.println(X[1][2]);

	}

}
