package JavaPrograms;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		
		File NP = new File("C:\\Users\\subas\\Desktop\\Subash.txt");
		
		NP.createNewFile();

	}

}
