package fileCompressor;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		//try catch the file creation
		try {
			File file = new File("C:\\Users\\jay_prakash\\Desktop\\textFile.txt");
			//create if file doesn't exists
			boolean createFile  = file.createNewFile();
			if(createFile) {
				System.out.println("File has been created");
			}
			else {
				System.out.println("File Already exists");
				
			}
			
		}catch(IOException e) {
			System.out.println("An exception has been caught");
			e.printStackTrace();
		}

	}

}
