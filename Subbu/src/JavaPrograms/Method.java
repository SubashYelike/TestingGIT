package JavaPrograms;

public class Method extends SampleClass1 {

	
		public void ADD(int A, int B){ //Method over riding (parent class is also contains same method name and signature)
			int X = A;
			int Y = B;                        //Both overloading and over riding is know as pholimorphism
			int Z = A+B;
			System.out.println(Z);
			}
		public void ADD(int A, int B,int C){ //Method over Loading (When 2 method names are same but the parameters are different)
			int X = A;
			int Y = B;                       //Both overloading and over riding is know as pholimorphism
			int Z = A+B+C;
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
			public static void main(String[]args){

			Method obj1 = new Method();
			obj1.Mul(10, 10);
			obj1.Mul(20, 10);
			
			}


	}

