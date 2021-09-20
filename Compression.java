package fileCompressor;
import java.util.zip.GZIPOutputStream;
import java.io.IOException;
import  java.io.FileInputStream;
import java.io.FileOutputStream;
public class Compression {
         public static void main(String[] args) {
        	 Compression fcomp  = new Compression();
        	 fcomp.createCompressedFile();
        	 
         }

		public void createCompressedFile() {
			byte[] buffer = new byte[1024];
			try {
				GZIPOutputStream gzip = new GZIPOutputStream(new FileOutputStream("C:\\Users\\jay_prakash\\Desktop\\textFile.gz"));
				FileInputStream fs = new FileInputStream("C:\\Users\\jay_prakash\\Desktop\\textFile.txt");
				
				int length ;
				if((length = fs.read(buffer)) > 0 ){
					gzip.write(buffer, 0, length);
					
				}
				fs.close();
				gzip.finish();
				gzip.close();
				System.out.println("The compressed has been created");
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
		}
}
