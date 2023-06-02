package JavaPrograms;

import java.util.regex.Pattern;

import org.checkerframework.checker.units.qual.m;

public class regulerExpression {

	public static void main(String[] args) {
		
		String Name = "mas";
		
		System.out.println(Pattern.matches("m..", Name));

	}

}
