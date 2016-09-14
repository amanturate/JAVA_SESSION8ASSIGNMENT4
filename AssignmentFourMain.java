
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AssignmentFourMain {
	
	public static void main(String[] args) throws IOException {
		
		int data=0, count=0;
		char letter;
		String filePath = new File("Input.txt").getAbsolutePath();
		
		FileInputStream fis = new FileInputStream(filePath);
		
		
		while(data != -1){
			data = fis.read();
			letter = Character.toLowerCase((char)data);
			if(letter=='a' || letter=='e' ||
			        letter=='i' || letter=='o' ||
			        letter=='u'){count++;}
			
		}
		
		System.out.println("Total Number of vowel in the file is " + count);
		
	}

}
