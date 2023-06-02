package JavaPrograms;

import java.io.FileWriter;
import java.io.IOException;

public class GetFileInformation {

	public static void main(String[] args) throws IOException {
		
		FileWriter NPwrt = new FileWriter("C:\\Users\\subas\\Desktop\\Subash.txt");
		
		NPwrt.write("Hi i am Subash\n");
		NPwrt.write("Hi i am Sravanthi\n");
		NPwrt.write("Hi i am Saujanya\n");
		
		
		NPwrt.close();

	}

}
