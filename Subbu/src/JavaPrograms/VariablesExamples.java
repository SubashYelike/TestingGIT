package JavaPrograms;

public class VariablesExamples {
	
	int x = 100;//Instance Variables
	int y = 200;
	
	static int C = 500;//Static variables
	static int D = 1000;

	public static void main(String[] args) {
		
		int A = 10;// Local Variables
		int B = 20;
		System.out.println(A);
		System.out.println(B);
		
		VariablesExamples obj = new VariablesExamples();
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		System.out.println(VariablesExamples.C);
		System.out.println(VariablesExamples.D);
		
	}

}
