import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


public class JavaReadFileBufferedReader {
	public static void main(String[] args){
		try {
			BufferedReader bis = new BufferedReader(new FileReader("C://file.txt"));
			String line;
			try {
				// Read a text file line by line
				while((line = bis.readLine()) != null ){
					System.out.println(line);
				}
			}finally {
				bis.close();
			}
		}catch (IOException ex){
			ex.printStackTrace();
		}
	}
}
