package JavaPrograms;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 20;
		int C = 30;
		
		if (C>A) {
			
			if (C<B) {
				
				//System.out.println("C is greater than B");
								
			}else {
				System.out.println("No C is not greater than B");
			}
			
			
		}else {
			System.out.println("No C is not greater than A");
		}

	}

}
