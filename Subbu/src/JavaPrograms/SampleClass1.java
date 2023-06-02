package JavaPrograms;

public class SampleClass1 {
	
	public void ADD(int A, int B){
		
		int X = A;
		int Y = B;
		int Z = A+B;
		System.out.println(Z);	
		
	}
public void SUB(int A, int B){
		
		int X = A;
		int Y = B;
		int Z = A-B;
		System.out.println(Z);	
		
	}
public void Mul(int A, int B){
	
	int X = A;
	int Y = B;
	int Z = A*B;
	System.out.println(Z);	
	
}
	public static void main(String[] args) {
		
		SampleClass1 objadd = new SampleClass1();
		objadd.ADD(10, 20);
		objadd.SUB(10, 20);
		objadd.Mul(10, 20);
			

	}

}
