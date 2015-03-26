import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


//Writing to a file with FileWriter ¨C writes characters to a file
//Writing to a file with BufferedWriter ¨C writes characters or text to a stream or a file

public class JavaWriteFileBufferedWriter {
	
	public static void main(String[] args)
	{
		BufferedWriter bos = null;
		try {
			bos = new BufferedWriter(new FileWriter("C://textfile.txt"));
			String fileContent = "Java file write example using BufferedWriter";
//			byte[] byteArray = fileContent.getBytes();
			bos.write(fileContent);
			bos.flush();
		}catch (SecurityException e){
			System.err.println("Access to the file is denied");
			e.printStackTrace();
		} catch (FileNotFoundException e){
			System.err.println("Can't find file, or it is a directory");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println();
			e.printStackTrace();
		}
		
		/*
		 * Stream uses resources and 
		 * we have to be sure that stream will be closed
		 * if exception has been thrown
		 */
		finally {
			try {
				if(bos != null){
					bos.close();
				}
			}catch (Exception e){
				System.err.println("Can't close the stream!");
			}
		}
	}
}
