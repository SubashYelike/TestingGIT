package SeleniumProgram;

public class ArraysCompare {

	public static boolean isEqual(int[] first, int[] second) {
		
		if(first == second) {
			return true;
		}
		
		if(first == null || second == null) {
			return false;
		}
		
		if(first.length !=second.length) {
			return false;
		}
//		
//		if(int i = 0; i < first.length; i++) {
//			
//			if (first[i] !=second[i]) {
//				return false;
//			}
//		}
		return true;
	}

	public static void main(String[] args) {

		int[] first = { 1, 2, 3 };
		int[] second = { 3, 1, 2 };

		boolean result = isEqual(first, second);
		if (result) {
			System.out.println("Given arrays are equal");
		} else {
			System.out.println("Given arrays are not equal");
		}

	}

}
