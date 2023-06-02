package JavaPrograms;

public class IfElseIfCondition {

	public static void main(String[] args) {
		
		int Age = 60; // Child, Teen, Senior and Old

		if (Age == 10) {

			System.out.println("He is Child");
		} else if (Age == 19) {
			System.out.println("He is Teen");
		} else if (Age == 60) {

			System.out.println("He is senior citizen");
		} else if (Age == 80) {

			System.out.println("He is Old");
		} else {

			System.out.println("No age is matching");
		}

	}

}
