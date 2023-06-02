package JavaPrograms;

public class Hello2 {

	int CC = 500;
	int DD = 600;
	
	static int XX = 1000;
	static int YY = 2000;
		
	public static void main(String[] args) {
			int AA = 100;
			int BB = 200;
			System.out.println(AA);
			System.out.println(BB);
			
			Hello2 obj2 = new Hello2();
			
			System.out.println(obj2.CC);
			System.out.println(obj2.DD);
			System.out.println(Hello2.XX);
			System.out.println(Hello2.YY);
			
			Hello1 obj = new Hello1();
			
			System.out.println(obj.C);
			System.out.println(obj.D);
			
			System.out.println(Hello1.X);
			System.out.println(Hello1.Y);
			
			
		

	}

}
