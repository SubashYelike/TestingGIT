package JavaPrograms;

public class ExampleProgram {
	
	int A = 10;
	
	public void add() {
		int B = 100;
		System.out.println(A+B);
	}
	public void add1() {
		int C = 200;
		System.out.println(A+C);
	}
	
	public void add2() {
		int D = 400;
		System.out.println(A+D);
	}

	public static void main(String[] args) {
		
		ExampleProgram obj = new ExampleProgram();
		obj.add();
		obj.add1();
		obj.add2();
		

	}

}
