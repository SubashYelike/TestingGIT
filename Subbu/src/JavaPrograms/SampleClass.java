package JavaPrograms;

public class SampleClass {
	
	public void ADD(int A,int B){
		int X = A;
		int Y = B;
		int Z = A+B;
		System.out.println(Z);
	}
	public void SUB(int A,int B){
		int X = A;
		int Y = B;
		int Z = A-B;
		System.out.println(Z);
	}
	public void Mul(int A,int B){
		int X = A;
		int Y = B;
		int Z = A*B;
		System.out.println(Z);
	}

	public static void main(String[] args) {
		SampleClass obj2 = new SampleClass();
		obj2.ADD(20, 30);
		obj2.SUB(40, 30);
		obj2.Mul(20, 10);

	}

}
